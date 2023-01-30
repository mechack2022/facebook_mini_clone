package com.fragile.facebookclone_springboot.service;

import com.fragile.facebookclone_springboot.entity.Comment;
import com.fragile.facebookclone_springboot.entity.Like;
import com.fragile.facebookclone_springboot.entity.Post;
import com.fragile.facebookclone_springboot.entity.User;

import java.util.Optional;

public interface LikeService {
    void addLike(Like like);

    void removeLike(Long id);

    Optional<Like> getPostLikeByUser(Post post, User user);

    Optional<Like> getCommentLikeByUser(Comment comment, User user);

}