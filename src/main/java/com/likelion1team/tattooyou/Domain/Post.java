package com.likelion1team.tattooyou.Domain;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

    @OneToOne(fetch = FetchType.LAZY)
    private Image image;

    @ManyToOne
    private User writer;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

}

