package com.minyress.service.impl;

import com.minyress.bean.User;
import com.minyress.dao.UserDao;
import com.minyress.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/4/13.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {

    }

    @Override
    public User getUserById(String userId) {
        return userDao.getUser(userId);
    }
}
