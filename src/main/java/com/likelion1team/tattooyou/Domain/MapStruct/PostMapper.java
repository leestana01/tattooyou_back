package com.likelion1team.tattooyou.Domain.MapStruct;

import com.likelion1team.tattooyou.Domain.DTO.Post.PostReqDto;
import com.likelion1team.tattooyou.Domain.DTO.Post.PostResDto;
import com.likelion1team.tattooyou.Domain.MapStruct.CustomMapper.CustomPostMapper;
import com.likelion1team.tattooyou.Domain.Post;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {CustomPostMapper.class})
public interface PostMapper {
    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);


    Post postDtoToPost(PostReqDto dto);

    PostResDto postToPostResDto(Post post);

}
