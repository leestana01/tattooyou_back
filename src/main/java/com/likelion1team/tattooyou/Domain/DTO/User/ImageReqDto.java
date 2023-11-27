package com.likelion1team.tattooyou.Domain.DTO.User;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class ImageReqDto {
    private Long id; // 유저 id임
    private MultipartFile image;
}