package ru.brobrocode.cadra.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.repository.UserInfoRepository;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Slf4j
@Service
public class CustomOAuth2UserService implements OAuth2UserService<OAuth2UserRequest, OAuth2User> {

	private final DefaultOAuth2UserService defaultUserService = new DefaultOAuth2UserService();
//	private final UserInfoRepository userInfoRepository;

	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
		OAuth2User oauth2User = defaultUserService.loadUser(userRequest);
		Map<String, Object> attributes = oauth2User.getAttributes();

//		if (!attributes.isEmpty()) {
//			saveUserInfo(attributes);
//		}
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

		return new DefaultOAuth2User(
				authorities,
				attributes,
				"id"
		);
	}
}
