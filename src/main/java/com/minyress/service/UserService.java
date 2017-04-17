package com.minyress.service;

import com.minyress.bean.User;

/**
 * Created by admin on 2017/4/13.
 */
public interface UserService {

    void addUser(User user);

    User getUserById(String userId);
}
