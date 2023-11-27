package com.likelion1team.tattooyou.Repository;

import com.likelion1team.tattooyou.Domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image,Long> {
}
