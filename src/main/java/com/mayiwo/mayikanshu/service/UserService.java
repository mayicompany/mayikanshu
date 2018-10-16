package com.mayiwo.mayikanshu.service;

import com.mayiwo.mayikanshu.dao.UserDao;
import com.mayiwo.mayikanshu.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserDao userDao;
    //注册
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}

