package com.minyress.dao;

import com.minyress.bean.User;

/**
 * Created by admin on 2017/4/17.
 */
public interface UserDao {
    User getUser(String userId);
}
