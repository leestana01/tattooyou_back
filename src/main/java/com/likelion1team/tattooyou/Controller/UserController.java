package com.likelion1team.tattooyou.Controller;

import com.likelion1team.tattooyou.Domain.DTO.Post.PostReqDto;
import com.likelion1team.tattooyou.Domain.DTO.Post.PostResDto;
import com.likelion1team.tattooyou.Domain.DTO.User.ImageReqDto;
import com.likelion1team.tattooyou.Domain.DTO.User.UserLoginReqDto;
import com.likelion1team.tattooyou.Domain.DTO.User.UserLoginResDto;
import com.likelion1team.tattooyou.Domain.DTO.User.UserRegisterReqDto;
import com.likelion1team.tattooyou.Domain.Image;
import com.likelion1team.tattooyou.Service.PostService;
import com.likelion1team.tattooyou.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final PostService postService;

    @PostMapping("/register")
    public ResponseEntity<UserLoginResDto> createUser(@RequestBody UserRegisterReqDto reqDto){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.createUser(reqDto));
    }

    @PostMapping("/login")
    public ResponseEntity<UserLoginResDto> loginUser(@RequestBody UserLoginReqDto reqDto){
        return ResponseEntity.status(HttpStatus.OK)
                .body(userService.findUserByDto(reqDto));
    }

    @PostMapping("/posts")
    public ResponseEntity<PostResDto> createPostsByUser(@ModelAttribute PostReqDto reqDto){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(postService.createPost(reqDto));
    }

    @PostMapping("/images")
    public ResponseEntity<String> addImageToUser(@ModelAttribute ImageReqDto reqDto){
        userService.createImageByUser(reqDto);
        return new ResponseEntity<>("이미지 추가 완료", HttpStatus.CREATED);
    }

    // GET ----------------------------------------------------------------

    @GetMapping("/{id}")
    public ResponseEntity<UserLoginResDto> findUserById(@PathVariable long id){
        return ResponseEntity.status(HttpStatus.OK)
                .body(userService.findUserById(id));
    }

    @GetMapping("/images/{id}")
    public ResponseEntity<List<byte[]>> findImagesById(@PathVariable long id){
        return ResponseEntity.status(HttpStatus.OK)
                .body(userService.findImagesByUser(id));
    }

    @GetMapping("/posts")
    public ResponseEntity<List<PostResDto>> findAllPosts(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(userService.findAllPosts());
    }

    @GetMapping("/posts/{id}")
    public ResponseEntity<List<PostResDto>> findPostsById(@PathVariable long id){
        return ResponseEntity.status(HttpStatus.OK)
                .body(userService.findPostsByUser(id));
    }
}