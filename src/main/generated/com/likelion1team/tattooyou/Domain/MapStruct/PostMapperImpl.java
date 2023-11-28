package com.likelion1team.tattooyou.Domain.MapStruct;

import com.likelion1team.tattooyou.Domain.DTO.Post.PostReqDto;
import com.likelion1team.tattooyou.Domain.DTO.Post.PostResDto;
import com.likelion1team.tattooyou.Domain.Image;
import com.likelion1team.tattooyou.Domain.Post;
import com.likelion1team.tattooyou.Domain.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T22:36:25+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Azul Systems, Inc.)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public Post postDtoToPost(PostReqDto dto, Image image, User writer, Date createdAt) {
        if ( dto == null && image == null && writer == null && createdAt == null ) {
            return null;
        }

        Post.PostBuilder post = Post.builder();

        if ( dto != null ) {
            post.title( dto.getTitle() );
            post.content( dto.getContent() );
        }
        post.image( image );
        post.writer( writer );
        post.createdAt( createdAt );

        return post.build();
    }

    @Override
    public PostResDto postToPostResDto(Post post) {
        if ( post == null ) {
            return null;
        }

        PostResDto.PostResDtoBuilder postResDto = PostResDto.builder();

        postResDto.image( imageToByteArray( post.getImage() ) );
        postResDto.username( postWriterUsername( post ) );
        postResDto.title( post.getTitle() );
        postResDto.content( post.getContent() );
        postResDto.createdAt( post.getCreatedAt() );

        return postResDto.build();
    }

    @Override
    public List<PostResDto> postListToPostDtoList(List<Post> postList) {
        if ( postList == null ) {
            return null;
        }

        List<PostResDto> list = new ArrayList<PostResDto>( postList.size() );
        for ( Post post : postList ) {
            list.add( postToPostResDto( post ) );
        }

        return list;
    }

    private String postWriterUsername(Post post) {
        if ( post == null ) {
            return null;
        }
        User writer = post.getWriter();
        if ( writer == null ) {
            return null;
        }
        String username = writer.getUsername();
        if ( username == null ) {
            return null;
        }
        return username;
    }
}
