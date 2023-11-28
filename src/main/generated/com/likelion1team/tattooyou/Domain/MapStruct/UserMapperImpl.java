package com.likelion1team.tattooyou.Domain.MapStruct;

import com.likelion1team.tattooyou.Domain.DTO.User.UserLoginReqDto;
import com.likelion1team.tattooyou.Domain.DTO.User.UserLoginResDto;
import com.likelion1team.tattooyou.Domain.DTO.User.UserRegisterReqDto;
import com.likelion1team.tattooyou.Domain.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T18:12:00+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Azul Systems, Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User userLoginDtoToUser(UserLoginReqDto dto) {
        if ( dto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.userId( dto.getUserId() );
        user.password( dto.getPassword() );

        return user.build();
    }

    @Override
    public User userRegisterReqDtoToUser(UserRegisterReqDto dto) {
        if ( dto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.userId( dto.getUserId() );
        user.password( dto.getPassword() );
        user.userName( dto.getUserName() );

        return user.build();
    }

    @Override
    public UserLoginResDto userToUserLoginDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserLoginResDto.UserLoginResDtoBuilder userLoginResDto = UserLoginResDto.builder();

        userLoginResDto.id( user.getId() );
        userLoginResDto.userId( user.getUserId() );
        userLoginResDto.userName( user.getUserName() );

        return userLoginResDto.build();
    }
}
