package com.likelion1team.tattooyou.Service;

import com.likelion1team.tattooyou.Domain.DTO.Shop.ShopDto;
import com.likelion1team.tattooyou.Domain.MapStruct.ShopMapper;
import com.likelion1team.tattooyou.Domain.Shop;
import com.likelion1team.tattooyou.Repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopService {
//    Shop은 name, phoneNumber, location을 변수로 지님

    private final ShopRepository shopRepository;

    public ShopDto createShop(ShopDto dto){
        Shop shop = ShopMapper.INSTANCE.shopDtoToShop(dto);
        shopRepository.save(shop);
        return ShopMapper.INSTANCE.shopToShopDto(shop);
    }

    public List<ShopDto> findAllShops(){
        List<Shop> shops = shopRepository.findAll();
        return ShopMapper.INSTANCE.shopListToShopDtoList(shops);
    }

}
