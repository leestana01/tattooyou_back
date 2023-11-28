package com.likelion1team.tattooyou.Domain.MapStruct;

import com.likelion1team.tattooyou.Domain.DTO.Post.PostReqDto;
import com.likelion1team.tattooyou.Domain.DTO.Post.PostResDto;
import com.likelion1team.tattooyou.Domain.Image;
import com.likelion1team.tattooyou.Domain.Post;
import com.likelion1team.tattooyou.Domain.User;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PostMapper {
    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    @Mapping(target = "id", ignore = true) // id는 무시
    @Mapping(target = "image", source = "image")
    @Mapping(target = "writer", source = "writer")
    @Mapping(target = "createdAt", source = "createdAt")
    Post postDtoToPost(PostReqDto dto, Image image, User writer, Date createdAt);

    // Entity -> DTO
    @Mapping(target = "image", source = "image", qualifiedByName = "imgToByte")
    @Mapping(target = "username", source = "writer.username")
    PostResDto postToPostResDto(Post post);

    @Mapping(target = "image", source = "image", qualifiedByName = "imgToByte")
    @Mapping(target = "username", source = "writer.username")
    List<PostResDto> postListToPostDtoList(List<Post> postList);


    @Named("imgToByte")
    default byte[] imageToByteArray(Image image) {
        return image.getImage();
    }
}
