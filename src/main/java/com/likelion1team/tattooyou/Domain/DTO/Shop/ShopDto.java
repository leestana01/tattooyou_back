package com.likelion1team.tattooyou.Domain.DTO.Shop;

import lombok.*;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopDto {
    private String name;
    private String callNumber;
    private String location;
}