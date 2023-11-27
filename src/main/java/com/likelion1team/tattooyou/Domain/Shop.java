package com.likelion1team.tattooyou.Domain;

import lombok.*;
import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String callNumber;

    @Column(nullable = false)
    private String location;
}
