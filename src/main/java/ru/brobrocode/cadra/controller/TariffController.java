package ru.brobrocode.cadra.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.brobrocode.cadra.dto.TariffRequest;
import ru.brobrocode.cadra.dto.TariffResponse;
import ru.brobrocode.cadra.service.TariffService;

import java.util.List;

@RestController
@RequestMapping("tariffs")
@RequiredArgsConstructor
@Slf4j
@Tag(name = "Tariff Controller", description = "Operations related to tariff management")
public class TariffController {

    private final TariffService tariffService;

    @GetMapping
    @Operation(summary = "Get all tariffs", description = "Retrieve a list of all tariffs")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved tariffs"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public ResponseEntity<List<TariffResponse>> getAllTariffs() {
        log.info("GET /api/tariffs - Getting all tariffs");
        List<TariffResponse> tariffs = tariffService.getAllTariffs();
        return ResponseEntity.ok(tariffs);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get tariff by ID", description = "Retrieve a specific tariff by its ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved tariff"),
            @ApiResponse(responseCode = "404", description = "Tariff not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public ResponseEntity<TariffResponse> getTariffById(
            @Parameter(description = "Tariff ID", required = true) @PathVariable Long id) {
        log.debug("GET /api/tariffs/{} - Getting tariff by id", id);
        TariffResponse tariff = tariffService.getTariffById(id);
        return ResponseEntity.ok(tariff);
    }

    @GetMapping("/active")
    @Operation(summary = "Get active tariffs", description = "Retrieve a list of all active tariffs")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved active tariffs"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public ResponseEntity<List<TariffResponse>> getActiveTariffs() {
        log.debug("GET /api/tariffs/active - Getting active tariffs");
        List<TariffResponse> tariffs = tariffService.getActiveTariffs();
        return ResponseEntity.ok(tariffs);
    }

    @GetMapping("/inactive")
    @Operation(summary = "Get inactive tariffs", description = "Retrieve a list of all inactive tariffs")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved inactive tariffs"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public ResponseEntity<List<TariffResponse>> getInactiveTariffs() {
        log.debug("GET /api/tariffs/inactive - Getting inactive tariffs");
        List<TariffResponse> tariffs = tariffService.getInactiveTariffs();
        return ResponseEntity.ok(tariffs);
    }

    @GetMapping("/active/sorted-by-price")
    @Operation(summary = "Get active tariffs sorted by price", description = "Retrieve active tariffs sorted by price in ascending order")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved sorted active tariffs"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public ResponseEntity<List<TariffResponse>> getActiveTariffsSortedByPrice() {
        log.debug("GET /api/tariffs/active/sorted-by-price - Getting active tariffs sorted by price");
        List<TariffResponse> tariffs = tariffService.getActiveTariffsSortedByPrice();
        return ResponseEntity.ok(tariffs);
    }

    @GetMapping("/by-name/{name}")
    @Operation(summary = "Get tariff by name", description = "Retrieve a specific tariff by its name")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved tariff"),
            @ApiResponse(responseCode = "404", description = "Tariff not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public ResponseEntity<TariffResponse> getTariffByName(
            @Parameter(description = "Tariff name", required = true) @PathVariable String name) {
        log.debug("GET /api/tariffs/by-name/{} - Getting tariff by name", name);
        TariffResponse tariff = tariffService.getTariffByName(name);
        return ResponseEntity.ok(tariff);
    }

    @PostMapping
    @Operation(summary = "Create new tariff", description = "Create a new tariff")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successfully created tariff"),
            @ApiResponse(responseCode = "400", description = "Invalid input data"),
            @ApiResponse(responseCode = "409", description = "Tariff with this name already exists"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public ResponseEntity<TariffResponse> createTariff(
            @Parameter(description = "Tariff data", required = true) @Valid @RequestBody TariffRequest request) {
        log.debug("POST /api/tariffs - Creating new tariff with name: {}", request.getName());
        TariffResponse createdTariff = tariffService.createTariff(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTariff);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update tariff", description = "Update an existing tariff")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully updated tariff"),
            @ApiResponse(responseCode = "400", description = "Invalid input data"),
            @ApiResponse(responseCode = "404", description = "Tariff not found"),
            @ApiResponse(responseCode = "409", description = "Tariff with this name already exists"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public ResponseEntity<TariffResponse> updateTariff(
            @Parameter(description = "Tariff ID", required = true) @PathVariable Long id,
            @Parameter(description = "Updated tariff data", required = true) @Valid @RequestBody TariffRequest request) {
        log.debug("PUT /api/tariffs/{} - Updating tariff", id);
        TariffResponse updatedTariff = tariffService.updateTariff(id, request);
        return ResponseEntity.ok(updatedTariff);
    }

//    @DeleteMapping("/{id}")
//    @Operation(summary = "Delete tariff", description = "Delete a tariff by its ID")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "204", description = "Successfully deleted tariff"),
//            @ApiResponse(responseCode = "404", description = "Tariff not found"),
//            @ApiResponse(responseCode = "409", description = "Cannot delete tariff as it is referenced by other entities"),
//            @ApiResponse(responseCode = "500", description = "Internal server error")
//    })
//    public ResponseEntity<Void> deleteTariff(
//            @Parameter(description = "Tariff ID", required = true) @PathVariable Long id) {
//        log.debug("DELETE /api/tariffs/{} - Deleting tariff", id);
//        tariffService.deleteTariff(id);
//        return ResponseEntity.noContent().build();
//    }

//    @PatchMapping("/{id}/deactivate")
//    @Operation(summary = "Deactivate tariff", description = "Deactivate a tariff by setting isActive to false")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Successfully deactivated tariff"),
//            @ApiResponse(responseCode = "404", description = "Tariff not found"),
//            @ApiResponse(responseCode = "500", description = "Internal server error")
//    })
//    public ResponseEntity<TariffResponse> deactivateTariff(
//            @Parameter(description = "Tariff ID", required = true) @PathVariable Long id) {
//        log.debug("PATCH /api/tariffs/{}/deactivate - Deactivating tariff", id);
//        TariffResponse deactivatedTariff = tariffService.deactivateTariff(id);
//        return ResponseEntity.ok(deactivatedTariff);
//    }
//
//    @PatchMapping("/{id}/activate")
//    @Operation(summary = "Activate tariff", description = "Activate a tariff by setting isActive to true")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Successfully activated tariff"),
//            @ApiResponse(responseCode = "404", description = "Tariff not found"),
//            @ApiResponse(responseCode = "500", description = "Internal server error")
//    })
//    public ResponseEntity<TariffResponse> activateTariff(
//            @Parameter(description = "Tariff ID", required = true) @PathVariable Long id) {
//        log.debug("PATCH /api/tariffs/{}/activate - Activating tariff", id);
//        TariffResponse activatedTariff = tariffService.activateTariff(id);
//        return ResponseEntity.ok(activatedTariff);
//    }
}
