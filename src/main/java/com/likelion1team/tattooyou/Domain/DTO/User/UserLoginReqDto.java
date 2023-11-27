package com.likelion1team.tattooyou.Domain.DTO.User;

import lombok.Builder;

@Builder
public class UserLoginReqDto {
    private Long id;
    private String userId;
    private String password;
}
