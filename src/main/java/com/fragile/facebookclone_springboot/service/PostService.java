package com.fragile.facebookclone_springboot.service;

import com.fragile.facebookclone_springboot.entity.Post;

import java.util.List;

public interface PostService {
    Post createPost(Post post);

    List<Post> getAllPosts();

    Post getPost(Long id);

    void updatePost(Post updatePost);

    void deletePost(Long id);
}
