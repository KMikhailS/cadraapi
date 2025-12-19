package ru.brobrocode.cadra.mapper;

import org.mapstruct.*;
import ru.brobrocode.cadra.dto.TariffRequest;
import ru.brobrocode.cadra.dto.TariffResponse;
import ru.brobrocode.cadra.entity.Tariff;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface TariffMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Tariff toEntity(TariffRequest request);

    @Mapping(target = "features", source = "tariff.features",  qualifiedByName = "features")
    TariffResponse toResponse(Tariff tariff);

    List<TariffResponse> toResponseList(List<Tariff> tariffs);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    void updateEntity(@MappingTarget Tariff tariff, TariffRequest request);

    @Named("features")
    default List<String> getFeatures(String features) {
        if (features == null || features.isEmpty()) {
            return Collections.emptyList();
        }
        return Arrays.stream(features.split(";")).toList();
    }
}
