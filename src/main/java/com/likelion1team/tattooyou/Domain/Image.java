package com.likelion1team.tattooyou.Domain;

import lombok.*;
import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private byte[] image;
}
