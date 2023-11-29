package com.likelion1team.tattooyou.Domain.MapStruct;

import com.likelion1team.tattooyou.Domain.DTO.Shop.ShopDto;
import com.likelion1team.tattooyou.Domain.Shop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface ShopMapper {
    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);

    @Mapping(target = "name", source = "name")
    @Mapping(target = "callNumber", source = "callNumber")
    @Mapping(target = "location", source = "location")
    Shop shopDtoToShop(ShopDto shopDto);
    ShopDto shopToShopDto(Shop shop);

    List<ShopDto> shopListToShopDtoList(List<Shop> shopList);

}
