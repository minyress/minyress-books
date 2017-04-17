package com.minyress.dao.impl;

import com.minyress.bean.User;
import com.minyress.dao.UserDao;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by admin on 2017/4/17.
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User getUser(String userId) {
        return (User) getSqlSession().selectOne("USER.getUserById", userId);
    }


}
