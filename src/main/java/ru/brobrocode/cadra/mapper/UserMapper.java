package ru.brobrocode.cadra.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;
import ru.brobrocode.cadra.dto.UserInfoDTO;
import ru.brobrocode.cadra.entity.UserInfo;

import java.util.List;

@Mapper(componentModel = "spring",
		unmappedTargetPolicy = ReportingPolicy.IGNORE,
		nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface UserMapper {

	@Mapping(target = "tariffId", source = "tariff.id")
	UserInfoDTO toUserInfoDTO(UserInfo userInfo);

	List<UserInfoDTO> toUserInfoList(List<UserInfo> users);
}
