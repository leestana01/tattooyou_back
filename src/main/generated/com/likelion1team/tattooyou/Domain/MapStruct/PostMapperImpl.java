package com.likelion1team.tattooyou.Domain.MapStruct;

import com.likelion1team.tattooyou.Domain.DTO.Post.PostReqDto;
import com.likelion1team.tattooyou.Domain.DTO.Post.PostResDto;
import com.likelion1team.tattooyou.Domain.Image;
import com.likelion1team.tattooyou.Domain.Post;
import com.likelion1team.tattooyou.Domain.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T19:05:28+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Azul Systems, Inc.)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public Post postDtoToPost(PostReqDto dto, Image image, User writer) {
        if ( dto == null && image == null && writer == null ) {
            return null;
        }

        Post.PostBuilder post = Post.builder();

        if ( dto != null ) {
            post.title( dto.getTitle() );
            post.content( dto.getContent() );
        }
        post.image( image );
        post.writer( writer );

        return post.build();
    }

    @Override
    public PostResDto postToPostResDto(Post post) {
        if ( post == null ) {
            return null;
        }

        PostResDto.PostResDtoBuilder postResDto = PostResDto.builder();

        postResDto.image( imageToByteArray( post.getImage() ) );
        postResDto.title( post.getTitle() );
        postResDto.content( post.getContent() );
        postResDto.createdAt( post.getCreatedAt() );

        return postResDto.build();
    }
}
