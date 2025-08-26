package ru.brobrocode.cadra.mapper;

import org.mapstruct.*;
import ru.brobrocode.cadra.dto.TariffRequest;
import ru.brobrocode.cadra.dto.TariffResponse;
import ru.brobrocode.cadra.entity.Tariff;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface TariffMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "users", ignore = true)
    Tariff toEntity(TariffRequest request);

    TariffResponse toResponse(Tariff tariff);

    List<TariffResponse> toResponseList(List<Tariff> tariffs);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "users", ignore = true)
    void updateEntity(@MappingTarget Tariff tariff, TariffRequest request);
}