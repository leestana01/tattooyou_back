package com.likelion1team.tattooyou.Domain.MapStruct;

import com.likelion1team.tattooyou.Domain.DTO.Post.PostReqDto;
import com.likelion1team.tattooyou.Domain.DTO.Post.PostResDto;
import com.likelion1team.tattooyou.Domain.Image;
import com.likelion1team.tattooyou.Domain.Post;
import com.likelion1team.tattooyou.Domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import org.springframework.web.multipart.MultipartFile;

@Mapper(componentModel = "spring")
public interface PostMapper {
    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    @Mapping(target = "id", ignore = true) // id는 무시
    @Mapping(target = "createdAt", ignore = true) // createdAt도 무시
    @Mapping(target = "image", source = "image")
    @Mapping(target = "writer", source = "writer")
    Post postDtoToPost(PostReqDto dto, Image image, User writer);

    @Mapping(target = "image", source = "image", qualifiedByName = "imgToByte")
    PostResDto postToPostResDto(Post post);

    // Entity -> DTO
    @Named("imgToByte")
    default byte[] imageToByteArray(Image image) {
        return image.getImage();
    }
}
