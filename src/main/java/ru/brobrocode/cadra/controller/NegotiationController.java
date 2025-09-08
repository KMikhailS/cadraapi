package ru.brobrocode.cadra.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.brobrocode.cadra.dto.NegotiationsStatsDTO;
import ru.brobrocode.cadra.service.NegotiationService;

@RestController
@RequestMapping("/negotiations")
@RequiredArgsConstructor
public class NegotiationController {

    private final NegotiationService negotiationService;

    @GetMapping
    public ResponseEntity<NegotiationsStatsDTO> getAllNegotiations() {
        NegotiationsStatsDTO negotiations = negotiationService.getNegotiationsStats();
        return ResponseEntity.ok(negotiations);
    }
}