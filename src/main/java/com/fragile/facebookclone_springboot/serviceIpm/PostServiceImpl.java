package com.fragile.facebookclone_springboot.serviceIpm;

import com.fragile.facebookclone_springboot.entity.Post;
import com.fragile.facebookclone_springboot.repository.PostRepository;
import com.fragile.facebookclone_springboot.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {


    private final PostRepository postRepository;


    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post getPost(Long id) {
        return postRepository.findById(id).get();
    }

    @Override
    public void updatePost(Post updatePost) {
        postRepository.save(updatePost);
    }

    @Override
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
