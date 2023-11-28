package com.likelion1team.tattooyou.Domain;

import lombok.*;
import javax.persistence.*;

@Data
@Builder
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private byte[] image;
}
