package ru.brobrocode.cadra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.brobrocode.cadra.entity.Tariff;

import java.util.List;
import java.util.Optional;

@Repository
public interface TariffRepository extends JpaRepository<Tariff, Long> {

    List<Tariff> findByIsActiveTrue();

    List<Tariff> findByIsActiveFalse();

    Optional<Tariff> findByName(String name);

    @Query("SELECT t FROM Tariff t WHERE t.isActive = true ORDER BY t.price ASC")
    List<Tariff> findActiveTariffsByPriceAsc();

    boolean existsByName(String name);
}