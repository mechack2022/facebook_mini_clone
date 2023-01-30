package com.fragile.facebookclone_springboot.repository;

import com.fragile.facebookclone_springboot.entity.Comment;
import com.fragile.facebookclone_springboot.entity.Like;
import com.fragile.facebookclone_springboot.entity.Post;
import com.fragile.facebookclone_springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {

    Optional<Like> findByPostsAndUsers(Post posts, User users);
    Optional<Like> findByCommentsAndUsers(Comment comments, User users);
}
