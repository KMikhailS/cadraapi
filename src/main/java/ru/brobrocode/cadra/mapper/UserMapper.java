package ru.brobrocode.cadra.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;
import ru.brobrocode.cadra.client.model.MeApplicantProfile;
import ru.brobrocode.cadra.client.model.ResumesMineItem;
import ru.brobrocode.cadra.dto.ResumeDTO;
import ru.brobrocode.cadra.dto.SelectedTariffDTO;
import ru.brobrocode.cadra.dto.UserInfoDTO;
import ru.brobrocode.cadra.entity.SelectedTariff;
import ru.brobrocode.cadra.entity.UserInfo;

import java.util.List;

@Mapper(componentModel = "spring",
		unmappedTargetPolicy = ReportingPolicy.IGNORE,
		nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface UserMapper {

//	@Mapping(target = "selectedTariff", source = "selectedTariff", qualifiedByName = "getActiveTariff")
//	UserInfoDTO toUserInfoDTO(UserInfo userInfo);

//	List<UserInfoDTO> toUserInfoList(List<UserInfo> users);

	@Mapping(target = "id", source = "userProfile.id")
	@Mapping(target = "phone", source = "userProfile.phone")
	@Mapping(target = "email", source = "userProfile.email")
	@Mapping(target = "firstName", source = "userProfile.firstName")
	@Mapping(target = "lastName", source = "userProfile.lastName")
	@Mapping(target = "middleName", source = "userProfile.middleName")
	@Mapping(target = "selectedTariff", source = "selectedTariff")
	UserInfoDTO toUserInfoDTO(MeApplicantProfile userProfile, SelectedTariff selectedTariff);

	@Mapping(target = "title", source = "tariff.name")
	@Mapping(target = "maxResponses", source = "tariff.maxResponses")
	SelectedTariffDTO toSelectedTariffDTO(SelectedTariff selectedTariff);
}
