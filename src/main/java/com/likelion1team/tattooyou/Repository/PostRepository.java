package com.likelion1team.tattooyou.Repository;

import com.likelion1team.tattooyou.Domain.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
}
