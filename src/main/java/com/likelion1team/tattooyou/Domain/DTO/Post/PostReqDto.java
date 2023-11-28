package com.likelion1team.tattooyou.Domain.DTO.Post;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.Date;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostReqDto {
    private String title;
    private String content;

    // Image image에 대응
    private MultipartFile image;

    // User writer에 대응 -> JWT 사용 시 비우기
    private Long writerId;
}