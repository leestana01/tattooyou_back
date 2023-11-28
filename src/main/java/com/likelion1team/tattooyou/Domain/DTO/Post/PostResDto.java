package com.likelion1team.tattooyou.Domain.DTO.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@Builder
public class PostResDto {
    private String title;
    private String content;

    // Image image에 대응
    private byte[] image;

    // User writer에 대응
    private String username;

    private Date createdAt;
}