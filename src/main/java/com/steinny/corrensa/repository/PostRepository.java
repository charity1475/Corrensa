package com.steinny.corrensa.repository;

import com.steinny.corrensa.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
