package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.brobrocode.cadra.client.api.NegotiationsApi;
import ru.brobrocode.cadra.client.model.IncludesIdName;
import ru.brobrocode.cadra.client.model.NegotiationsListItem;
import ru.brobrocode.cadra.client.model.NegotiationsListResponse;
import ru.brobrocode.cadra.dto.NegotiationsStatsDTO;
import ru.brobrocode.cadra.entity.UserInfo;

import java.util.ArrayList;
import java.util.List;

import static ru.brobrocode.cadra.constants.HHApiConstants.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class NegotiationService {
    public static final String DISCARD = "discard";
    public static final String RESPONSE = "response";
    public static final String INVITATION = "invitation";
    public static final String INTERVIEW = "interview";
    public static final String HIRED = "hired";
    public static final String HIDDEN = "hidden";

    private final NegotiationsApi negotiationsApi;
    private final UserStateService userStateService;

    public NegotiationsStatsDTO getNegotiationsStats() {
        UserInfo userInfo = userStateService.getUserInfo();
        List<NegotiationsListItem> allNegotiations = getAllNegotiations(userInfo.getAccessToken());
        NegotiationsStatsDTO stats = new NegotiationsStatsDTO();
        int total = allNegotiations.size();
        int notResponded = 0;
        int discards = 0;
        int invites = 0;
        for (NegotiationsListItem negotiation : allNegotiations) {
            IncludesIdName state = negotiation.getState();
            if (RESPONSE.equals(state.getId()) || HIDDEN.equals(state.getId())) {
                notResponded++;
            } else if (DISCARD.equals(state.getId())) {
                discards++;
            } else if (INVITATION.equals(state.getId()) || INTERVIEW.equals(state.getId()) || HIRED.equals(state.getId())) {
                invites++;
            }
        }
        stats.setTotal(total);
        stats.setNotResponded(notResponded);
        stats.setDiscards(discards);
        stats.setInvites(invites);

        return stats;
    }

    public List<NegotiationsListItem> getAllNegotiations(String accessToken) {
        List<NegotiationsListItem> allNegotiations = new ArrayList<>();
        int page = 0;
        int perPage = 50;
        
        try {
            while (true) {
                ResponseEntity<NegotiationsListResponse> response = negotiationsApi.getNegotiations(
                        DEFAULT_USER_AGENT,
                        "Bearer " + accessToken,
                        page,
                        perPage,
                        null, // orderBy
                        null, // order
                        null, // vacancyId
                        null, // status
                        null, // hasUpdates
                        null, // withJobSearchStatus
                        false, // withGeneratedCollections
                        DEFAULT_LOCALE,
                        DEFAULT_HOST
                );

                if (response.getStatusCode().is2xxSuccessful()) {
                    NegotiationsListResponse negotiationsResponse = response.getBody();
                    if (negotiationsResponse == null ||
                            negotiationsResponse.getItems() == null ||
                            negotiationsResponse.getItems().isEmpty()) {
                        break;
                    }

                    allNegotiations.addAll(negotiationsResponse.getItems());
                    page++;
                }
            }
            
            log.info("Retrieved {} total negotiations", allNegotiations.size());
            return allNegotiations;
            
        } catch (Exception e) {
            log.error("Error getting all negotiations: {}", e.getMessage(), e);
            throw new RuntimeException("Failed to retrieve negotiations from hh.ru", e);
        }
    }
}
