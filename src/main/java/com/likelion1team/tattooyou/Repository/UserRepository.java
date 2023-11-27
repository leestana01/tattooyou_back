package com.likelion1team.tattooyou.Repository;

import com.likelion1team.tattooyou.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUserId(String userId);
}
