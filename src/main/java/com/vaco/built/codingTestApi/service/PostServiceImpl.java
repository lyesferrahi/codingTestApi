package com.vaco.built.codingTestApi.service;

import com.vaco.built.codingTestApi.model.Post;
import com.vaco.built.codingTestApi.repository.CategoryRepository;
import com.vaco.built.codingTestApi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class PostServiceImpl {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public Post createPost(Post post) {
        post.setTimeStamp(LocalDateTime.now());
        return postRepository.save(post);
    }

    public Post updatePost(Long id, Post post) {
        Post existingPost = postRepository.findById(id).orElse(null);
        if (existingPost != null) {
            existingPost.setTitle(post.getTitle());
            existingPost.setContents(post.getContents());
            existingPost.setCategory(post.getCategory());
            return postRepository.save(existingPost);
        }
        return null;
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    public void deleteAllPosts() {
        postRepository.deleteAll();
    }

    /*public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }*/
}
