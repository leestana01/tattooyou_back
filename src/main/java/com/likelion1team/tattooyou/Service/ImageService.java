package com.likelion1team.tattooyou.Service;

import com.likelion1team.tattooyou.Domain.Image;
import com.likelion1team.tattooyou.Repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityNotFoundException;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ImageService {

    private final ImageRepository imageRepository;

    public Image createImage(MultipartFile multipartFile) {
        byte[] data;
        try {
            data = multipartFile.getBytes();
        } catch (IOException e) {
            // 생각나는 예외가 일단 이거라 했는데, 맘에 안들어서 다시 처리해야할듯..!
            throw new EntityNotFoundException(e.getMessage());
        }
        Image image = new Image();
        image.setImage(data);
        return image;
    }
}
