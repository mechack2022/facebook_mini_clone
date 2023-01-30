package com.fragile.facebookclone_springboot.service;

import com.fragile.facebookclone_springboot.entity.Comment;

public interface CommentService {

    Comment createComment(Comment comment);

    Comment getComment(Long id);

    void updateComment(Comment updateComment);

    void deleteComment(Long id);

}