package com.likelion1team.tattooyou.Domain.DTO.User;

import lombok.*;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginReqDto {
    private String userId;
    private String password;
}
