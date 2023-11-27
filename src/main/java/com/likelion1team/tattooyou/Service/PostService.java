package com.likelion1team.tattooyou.Service;

import com.likelion1team.tattooyou.Domain.DTO.Post.PostReqDto;
import com.likelion1team.tattooyou.Domain.DTO.Post.PostResDto;
import com.likelion1team.tattooyou.Domain.MapStruct.PostMapper;
import com.likelion1team.tattooyou.Domain.Post;
import com.likelion1team.tattooyou.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public PostResDto createPost(PostReqDto reqDto){
        Post post = PostMapper.INSTANCE.postDtoToPost(reqDto);
        return PostMapper.INSTANCE.postToPostResDto(post);
    }
}
