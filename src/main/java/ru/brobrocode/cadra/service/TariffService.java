package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.brobrocode.cadra.dto.TariffRequest;
import ru.brobrocode.cadra.dto.TariffResponse;
import ru.brobrocode.cadra.entity.Tariff;
import ru.brobrocode.cadra.mapper.TariffMapper;
import ru.brobrocode.cadra.repository.TariffRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class TariffService {

    private final TariffRepository tariffRepository;
    private final TariffMapper tariffMapper;

    @Transactional(readOnly = true)
    public List<TariffResponse> getAllTariffs() {
        log.info("Getting all tariffs");
        List<Tariff> tariffs = tariffRepository.findAll();
        return tariffMapper.toResponseList(tariffs);
    }

    @Transactional(readOnly = true)
    public TariffResponse getTariffById(Long id) {
        log.debug("Getting tariff by id: {}", id);
        Tariff tariff = tariffRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tariff not found with id: " + id));
        return tariffMapper.toResponse(tariff);
    }

    @Transactional(readOnly = true)
    public List<TariffResponse> getActiveTariffs() {
        log.debug("Getting active tariffs");
        List<Tariff> tariffs = tariffRepository.findByIsActiveTrue();
        return tariffMapper.toResponseList(tariffs);
    }

    @Transactional(readOnly = true)
    public List<TariffResponse> getInactiveTariffs() {
        log.debug("Getting inactive tariffs");
        List<Tariff> tariffs = tariffRepository.findByIsActiveFalse();
        return tariffMapper.toResponseList(tariffs);
    }

    @Transactional(readOnly = true)
    public List<TariffResponse> getActiveTariffsSortedByPrice() {
        log.debug("Getting active tariffs sorted by price");
        List<Tariff> tariffs = tariffRepository.findActiveTariffsByPriceAsc();
        return tariffMapper.toResponseList(tariffs);
    }

    @Transactional(readOnly = true)
    public TariffResponse getTariffByName(String name) {
        log.debug("Getting tariff by name: {}", name);
        Tariff tariff = tariffRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException("Tariff not found with name: " + name));
        return tariffMapper.toResponse(tariff);
    }

    public TariffResponse createTariff(TariffRequest request) {
        if (tariffRepository.existsByName(request.getName())) {
            throw new IllegalArgumentException("Tariff with name '" + request.getName() + "' already exists");
        }
        try {
            Tariff tariff = tariffMapper.toEntity(request);
            tariff.setCreatedAt(LocalDateTime.now());
            tariff.setUpdatedAt(LocalDateTime.now());
            
            Tariff savedTariff = tariffRepository.save(tariff);
            log.info("Created tariff with id: {}", savedTariff.getId());
            return tariffMapper.toResponse(savedTariff);
        } catch (DataIntegrityViolationException e) {
            log.error("Data integrity violation while creating tariff", e);
            throw new RuntimeException("Failed to create tariff due to data constraints");
        }
    }

    public TariffResponse updateTariff(Long id, TariffRequest request) {
        log.debug("Updating tariff with id: {}", id);
        
        Tariff existingTariff = tariffRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tariff not found with id: " + id));

        if (!existingTariff.getName().equals(request.getName()) && 
            tariffRepository.existsByName(request.getName())) {
            throw new IllegalArgumentException("Tariff with name '" + request.getName() + "' already exists");
        }

        try {
            tariffMapper.updateEntity(existingTariff, request);
            existingTariff.setUpdatedAt(LocalDateTime.now());
            
            Tariff updatedTariff = tariffRepository.save(existingTariff);
            log.info("Updated tariff with id: {}", updatedTariff.getId());
            return tariffMapper.toResponse(updatedTariff);
        } catch (DataIntegrityViolationException e) {
            log.error("Data integrity violation while updating tariff", e);
            throw new RuntimeException("Failed to update tariff due to data constraints");
        }
    }

    public void deleteTariff(Long id) {
        log.debug("Deleting tariff with id: {}", id);
        
        Tariff tariff = tariffRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tariff not found with id: " + id));

        try {
            tariffRepository.delete(tariff);
            log.info("Deleted tariff with id: {}", id);
        } catch (DataIntegrityViolationException e) {
            log.error("Data integrity violation while deleting tariff", e);
            throw new RuntimeException("Cannot delete tariff as it is referenced by other entities");
        }
    }

    public TariffResponse deactivateTariff(Long id) {
        log.debug("Deactivating tariff with id: {}", id);
        
        Tariff tariff = tariffRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tariff not found with id: " + id));

        tariff.setIsActive(false);
        tariff.setUpdatedAt(LocalDateTime.now());
        
        Tariff updatedTariff = tariffRepository.save(tariff);
        log.info("Deactivated tariff with id: {}", updatedTariff.getId());
        return tariffMapper.toResponse(updatedTariff);
    }

    public TariffResponse activateTariff(Long id) {
        log.debug("Activating tariff with id: {}", id);
        
        Tariff tariff = tariffRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tariff not found with id: " + id));

        tariff.setIsActive(true);
        tariff.setUpdatedAt(LocalDateTime.now());
        
        Tariff updatedTariff = tariffRepository.save(tariff);
        log.info("Activated tariff with id: {}", updatedTariff.getId());
        return tariffMapper.toResponse(updatedTariff);
    }
}