package com.likelion1team.tattooyou.Domain.DTO.User;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageReqDto {
    private Long id; // 유저 id임
    private MultipartFile image;
}
