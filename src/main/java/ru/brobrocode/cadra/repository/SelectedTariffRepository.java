package ru.brobrocode.cadra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.brobrocode.cadra.entity.SelectedTariff;
import ru.brobrocode.cadra.entity.UserInfo;

import java.util.List;
import java.util.Optional;

@Repository
public interface SelectedTariffRepository extends JpaRepository<SelectedTariff, Long> {

    Optional<SelectedTariff> findByUserIdAndIsActive(String userId, boolean isActive);

    List<SelectedTariff> findByUserId(String userId);
}