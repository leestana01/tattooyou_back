package com.likelion1team.tattooyou.Domain.DTO.Shop;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class ShopDto {
    private String name;
    private String callNumber;
    private String location;
}