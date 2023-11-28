package com.likelion1team.tattooyou.Domain.DTO.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class UserLoginResDto {
    private Long id;
    private String userId;
    private String username;
}
