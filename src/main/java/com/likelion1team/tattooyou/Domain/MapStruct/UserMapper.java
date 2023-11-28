package com.likelion1team.tattooyou.Domain.MapStruct;

import com.likelion1team.tattooyou.Domain.DTO.User.UserLoginReqDto;
import com.likelion1team.tattooyou.Domain.DTO.User.UserLoginResDto;
import com.likelion1team.tattooyou.Domain.DTO.User.UserRegisterReqDto;
import com.likelion1team.tattooyou.Domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userLoginDtoToUser(UserLoginReqDto dto);

    @Mapping(target = "username", source = "username") // MapStruct 고장나서 직접 함
    User userRegisterReqDtoToUser(UserRegisterReqDto dto);

    UserLoginResDto userToUserLoginDto(User user);

}
