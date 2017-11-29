package com.smart.service;

import com.smart.domain.User;
import com.smart.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> queryAllUser(){
//        System.out.println("spring service");
        List<User> users = userDao.queryAllUser();
        return users;
    }
}
