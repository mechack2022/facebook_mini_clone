package com.fragile.facebookclone_springboot.service;

import com.fragile.facebookclone_springboot.entity.User;

public interface UserService {
    User createUser(User user);

    User findUserByUsernameAndPassword(User user);

    User findById(Long id);
}
