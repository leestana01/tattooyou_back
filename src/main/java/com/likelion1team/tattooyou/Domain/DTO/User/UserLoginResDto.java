package com.likelion1team.tattooyou.Domain.DTO.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserLoginResDto {
    private Long id;
    private String userId;
    private String userName;
}
