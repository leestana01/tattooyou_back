package com.likelion1team.tattooyou.Repository;

import com.likelion1team.tattooyou.Domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop,Long> {
}
