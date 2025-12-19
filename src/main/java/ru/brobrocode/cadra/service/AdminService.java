//package ru.brobrocode.cadra.service;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import ru.brobrocode.cadra.dto.UserInfoDTO;
//import ru.brobrocode.cadra.dto.UserInfoRequest;
//import ru.brobrocode.cadra.entity.UserInfo;
//import ru.brobrocode.cadra.mapper.UserMapper;
//import ru.brobrocode.cadra.repository.UserInfoRepository;
//
//import java.util.List;
//
//@RequiredArgsConstructor
//@Service
//public class AdminService {
//
//	private final UserInfoRepository userInfoRepository;
//	private final UserMapper userMapper;
//
//	public UserInfoDTO saveUser(UserInfoRequest userRequest) {
//		UserInfo userInfo = new UserInfo();
//		userInfo.setFirstName(userRequest.getFirstName());
//		userInfo.setPhone(userRequest.getPhoneNumber());
//		UserInfo user = userInfoRepository.save(userInfo);
//		return userMapper.toUserInfoDTO(user);
//	}
//
//	public UserInfoDTO updateUser(String userId, UserInfoRequest userRequest) {
//		UserInfo userInfo = userInfoRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));
//		userInfo.setFirstName(userRequest.getFirstName());
//		userInfo.setPhone(userRequest.getPhoneNumber());
//		userInfo = userInfoRepository.save(userInfo);
//		return userMapper.toUserInfoDTO(userInfo);
//	}
//
//	public List<UserInfoDTO> getAllUsers() {
//		List<UserInfo> users = userInfoRepository.findAll();
//		return userMapper.toUserInfoList(users);
//	}
//}
