package com.likelion1team.tattooyou.Domain.DTO.User;

import lombok.Builder;

@Builder
public class UserLoginResDto {
    private Long id;
    private String userId;
    private String userName;
}
