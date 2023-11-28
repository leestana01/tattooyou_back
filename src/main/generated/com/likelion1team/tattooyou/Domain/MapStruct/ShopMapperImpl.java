package com.likelion1team.tattooyou.Domain.MapStruct;

import com.likelion1team.tattooyou.Domain.DTO.Shop.ShopDto;
import com.likelion1team.tattooyou.Domain.Shop;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T21:30:21+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Azul Systems, Inc.)"
)
@Component
public class ShopMapperImpl implements ShopMapper {

    @Override
    public Shop shopDtoToShop(ShopDto shopDto) {
        if ( shopDto == null ) {
            return null;
        }

        Shop.ShopBuilder shop = Shop.builder();

        return shop.build();
    }

    @Override
    public ShopDto shopToShopDto(Shop shop) {
        if ( shop == null ) {
            return null;
        }

        ShopDto.ShopDtoBuilder shopDto = ShopDto.builder();

        shopDto.name( shop.getName() );
        shopDto.callNumber( shop.getCallNumber() );
        shopDto.location( shop.getLocation() );

        return shopDto.build();
    }

    @Override
    public List<ShopDto> shopListToShopDtoList(List<Shop> shopList) {
        if ( shopList == null ) {
            return null;
        }

        List<ShopDto> list = new ArrayList<ShopDto>( shopList.size() );
        for ( Shop shop : shopList ) {
            list.add( shopToShopDto( shop ) );
        }

        return list;
    }
}
