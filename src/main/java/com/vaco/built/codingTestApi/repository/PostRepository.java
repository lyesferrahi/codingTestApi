package com.vaco.built.codingTestApi.repository;

import com.vaco.built.codingTestApi.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
