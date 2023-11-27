package com.likelion1team.tattooyou.Service;

import com.likelion1team.tattooyou.Domain.DTO.User.ImageReqDto;
import com.likelion1team.tattooyou.Domain.DTO.User.UserLoginReqDto;
import com.likelion1team.tattooyou.Domain.DTO.User.UserLoginResDto;
import com.likelion1team.tattooyou.Domain.Image;
import com.likelion1team.tattooyou.Domain.MapStruct.UserMapper;
import com.likelion1team.tattooyou.Domain.Post;
import com.likelion1team.tattooyou.Domain.User;
import com.likelion1team.tattooyou.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ImageService imageService;

    public UserLoginResDto createUser(UserLoginReqDto reqDto) {
        User user = UserMapper.INSTANCE.userLoginDtoToUser(reqDto);
        userRepository.save(user);
        return UserMapper.INSTANCE.userToUserLoginDto(user);
    }

    public void createImageByUser(ImageReqDto reqDto){
        User user = userRepository.findById(reqDto.getId())
                .orElseThrow(() -> new EntityNotFoundException(reqDto.getId().toString()));
        Image newImage = imageService.createImage(reqDto.getImage());
        user.getImages().add(newImage);
        userRepository.save(user);
    }

    // ---------------------------------------------------------------------

    public UserLoginResDto findUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id.toString()));
        return UserMapper.INSTANCE.userToUserLoginDto(user);
    }

    public List<Image> findImagesByUser(Long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id.toString()));
        return user.getImages();
    }

    public List<Post> findPostsByUser(Long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id.toString()));
        return user.getPosts();
    }


    // 다른 곳에서 사용 -----------------------------------------------------
    public User findEntityById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id.toString()));
    }
    public User findEntityByUserId(String userId){
        return userRepository.findByUserId(userId)
                .orElseThrow(() -> new EntityNotFoundException(userId));
    }

}
