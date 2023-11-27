package com.likelion1team.tattooyou.Domain.MapStruct.CustomMapper;

import com.likelion1team.tattooyou.Domain.Image;
import com.likelion1team.tattooyou.Domain.User;
import com.likelion1team.tattooyou.Service.ImageService;
import com.likelion1team.tattooyou.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
@RequiredArgsConstructor
public class CustomPostMapper {

    private final ImageService imageService;
    private final UserService userService;

    // DTO -> Entity
    public Image multipartFileToImage(MultipartFile multipartFile){
        return imageService.createImage(multipartFile);
    }

    public User longToUser(Long id){
        return userService.findEntityById(id);
    }

    // Entity -> DTO
    public byte[] imageToByteArray(Image image){return image.getImage();}


}
