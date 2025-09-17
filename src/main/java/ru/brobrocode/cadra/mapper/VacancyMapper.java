package ru.brobrocode.cadra.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;
import ru.brobrocode.cadra.client.model.VacanciesVacanciesItem;
import ru.brobrocode.cadra.client.model.VacanciesVacanciesResponse;
import ru.brobrocode.cadra.dto.VacanciesDTO;
import ru.brobrocode.cadra.dto.VacancyItemDTO;

import java.util.List;

@Mapper(componentModel = "spring",
		unmappedTargetPolicy = ReportingPolicy.IGNORE,
		nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface VacancyMapper {

	@Mapping(target = "items", source = "items")
	@Mapping(target = "found", source = "found")
	VacanciesDTO toVacanciesDTO(VacanciesVacanciesResponse response);

	@Mapping(target = "id", source = "id")
	@Mapping(target = "name", source = "name")
	@Mapping(target = "type", constant = "vacancy")
	@Mapping(target = "url", source = "alternateUrl")
	@Mapping(target = "acceptIncompleteResumes", source = "acceptIncompleteResumes")
	@Mapping(target = "hasTest", source = "hasTest")
	@Mapping(target = "archived", source = "archived")
	@Mapping(target = "responseLetterRequired", source = "responseLetterRequired")
	VacancyItemDTO toVacancyItemDTO(VacanciesVacanciesItem item);

	List<VacancyItemDTO> toVacancyItemDTOList(List<VacanciesVacanciesItem> items);
}