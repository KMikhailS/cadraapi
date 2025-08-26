package ru.brobrocode.cadra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.brobrocode.cadra.entity.UserInfo;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

	Optional<UserInfo> findById(String username);

	Optional<UserInfo> findByAuthCode(String authCode);
}
