package com.likelion1team.tattooyou.Domain.DTO.Post;
import lombok.Builder;

import java.util.Date;

@Builder
public class PostResDto {
    private String title;
    private String Content;

    // Image image에 대응
    private byte[] image;

    // User writer에 대응
    private String username;

    private Date createdAt;
}