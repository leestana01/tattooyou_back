package com.likelion1team.tattooyou.Domain.DTO.User;

import lombok.*;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterReqDto {
    private String userId;
    private String password;
    private String username;
}
