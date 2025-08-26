package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.brobrocode.cadra.dto.AuthCodeRequest;
import ru.brobrocode.cadra.dto.AuthCodeResponse;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.repository.UserInfoRepository;

@RequiredArgsConstructor
@Service
public class AuthService {

	private final UserInfoRepository userInfoRepository;

	public AuthCodeResponse auth(AuthCodeRequest authCodeRequest) {
		String authCode = authCodeRequest.getCode();
		UserInfo authorizedUser = userInfoRepository.findByAuthCode(authCode).orElse(null);
		if (authorizedUser != null) {
			return new AuthCodeResponse(authorizedUser.getId());
		}
		UserInfo userInfo = new UserInfo();
		userInfo.setAuthCode(authCode);
		userInfo = userInfoRepository.save(userInfo);
		return new AuthCodeResponse(userInfo.getId());
	}
}
