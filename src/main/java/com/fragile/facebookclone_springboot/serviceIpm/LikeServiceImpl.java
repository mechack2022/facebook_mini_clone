package com.fragile.facebookclone_springboot.serviceIpm;

import com.fragile.facebookclone_springboot.entity.Comment;
import com.fragile.facebookclone_springboot.entity.Like;
import com.fragile.facebookclone_springboot.entity.Post;
import com.fragile.facebookclone_springboot.entity.User;
import com.fragile.facebookclone_springboot.repository.LikeRepository;
import com.fragile.facebookclone_springboot.service.LikeService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LikeServiceImpl implements LikeService {
//    @Autowired
    private final LikeRepository likeRepository;

    public LikeServiceImpl(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    @Override
    public void addLike(Like like) {
        likeRepository.save(like);
    }

    @Override
    public void removeLike(Long id) {
        likeRepository.deleteById(id);
    }

    @Override
    public Optional<Like> getPostLikeByUser(Post post, User user) {
        return likeRepository.findByPostsAndUsers(post, user);
    }

    @Override
    public Optional<Like> getCommentLikeByUser(Comment comment, User user) {
        return likeRepository.findByCommentsAndUsers(comment, user);
    }
}
