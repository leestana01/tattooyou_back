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

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final UserService userService;
    private final ImageService imageService;
    public PostResDto createPost(PostReqDto reqDto){
        Image image = imageService.createImage(reqDto.getImage());
        User writer = userService.findEntityById(reqDto.getWriterId());
        Post post = PostMapper.INSTANCE.postDtoToPost(reqDto, image, writer);
        postRepository.save(post);
        return PostMapper.INSTANCE.postToPostResDto(post);
    }
}
