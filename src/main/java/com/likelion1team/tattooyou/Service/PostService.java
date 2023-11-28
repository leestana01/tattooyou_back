package com.likelion1team.tattooyou.Service;

import com.likelion1team.tattooyou.Domain.DTO.Post.PostReqDto;
import com.likelion1team.tattooyou.Domain.DTO.Post.PostResDto;
import com.likelion1team.tattooyou.Domain.Image;
import com.likelion1team.tattooyou.Domain.MapStruct.PostMapper;
import com.likelion1team.tattooyou.Domain.Post;
import com.likelion1team.tattooyou.Domain.User;
import com.likelion1team.tattooyou.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final UserService userService;
    private final ImageService imageService;
    public PostResDto createPost(PostReqDto reqDto){
        User writer = userService.findEntityById(reqDto.getWriterId());
        Image image = imageService.createImage(reqDto.getImage());
        Date createdAt = new Date();
        Post post = PostMapper.INSTANCE.postDtoToPost(reqDto, image, writer, createdAt);
        postRepository.save(post);
        return PostMapper.INSTANCE.postToPostResDto(post);
    }
}
