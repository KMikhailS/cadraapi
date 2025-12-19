//package ru.brobrocode.cadra.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//import ru.brobrocode.cadra.dto.UserInfoDTO;
//import ru.brobrocode.cadra.dto.UserInfoRequest;
//import ru.brobrocode.cadra.dto.UserInfoResponse;
//import ru.brobrocode.cadra.service.AdminService;
//
//import java.util.List;
//
//@RequiredArgsConstructor
//@RequestMapping("admin")
//@RestController()
//public class AdminController {
//
//	private final AdminService adminService;
//
//	@ResponseBody
//	@PostMapping("users")
//	public UserInfoDTO saveUser(@RequestBody UserInfoRequest user) {
//
//		return adminService.saveUser(user);
//	}
//
//	@ResponseBody
//	@PutMapping("user/{userId}")
//	public UserInfoDTO updateUser(@PathVariable("userId") String userId, @RequestBody UserInfoRequest user) {
//		return adminService.updateUser(userId, user);
//	}
//
//	@ResponseBody
//	@GetMapping("users")
//	public List<UserInfoDTO> getAllUsers() {
//		return adminService.getAllUsers();
//	}
//
//}
