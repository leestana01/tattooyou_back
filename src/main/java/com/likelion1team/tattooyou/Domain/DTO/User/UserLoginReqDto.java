package com.likelion1team.tattooyou.Domain.DTO.User;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserLoginReqDto {
    private String userId;
    private String password;
}
