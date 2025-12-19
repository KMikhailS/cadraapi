package ru.brobrocode.cadra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.brobrocode.cadra.dto.User;
import ru.brobrocode.cadra.entity.UserInfo;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

	Optional<UserInfo> findById(String id);

	@Query("SELECT DISTINCT u FROM UserInfo u " +
		   "LEFT JOIN FETCH u.selectedTariff st " +
		   "LEFT JOIN FETCH st.tariff t " +
		   "WHERE u.id = :userId")
	Optional<UserInfo> findByIdWithSelectedTariffs(@Param("userId") String userId);

	@Query("SELECT DISTINCT u FROM UserInfo u " +
		   "LEFT JOIN FETCH u.selectedTariff st " +
		   "LEFT JOIN FETCH st.tariff t " +
		   "WHERE u.id = :userId AND st.isActive = true")
	Optional<UserInfo> findByIdWithActiveTariff(@Param("userId") String userId);

	@Query("SELECT DISTINCT u FROM UserInfo u " +
		   "LEFT JOIN FETCH u.resumes " +
		   "WHERE u.id = :userId")
	Optional<UserInfo> findByIdWithResumes(@Param("userId") String userId);
}
