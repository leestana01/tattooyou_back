package com.likelion1team.tattooyou.Domain;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @OneToOne(fetch = FetchType.LAZY)
    private Image image;

    @ManyToOne(fetch = FetchType.LAZY)
    private User writer;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

}

