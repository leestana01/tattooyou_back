package com.likelion1team.tattooyou.Controller;

import com.likelion1team.tattooyou.Domain.DTO.Shop.ShopDto;
import com.likelion1team.tattooyou.Service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/shops")
public class ShopController {

    private final ShopService shopService;

    @PostMapping
    public ResponseEntity<ShopDto> createShop(ShopDto shopDto){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(shopService.createShop(shopDto));
    }

    @GetMapping
    public ResponseEntity<List<ShopDto>> getAllShops(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(shopService.findAllShops());
    }
}
