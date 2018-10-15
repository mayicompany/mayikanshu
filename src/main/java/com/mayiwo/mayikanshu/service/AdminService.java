package com.mayiwo.mayikanshu.service;

import com.mayiwo.mayikanshu.dao.AdminDao;
import com.mayiwo.mayikanshu.dao.UserDao;
import com.mayiwo.mayikanshu.model.Admin;
import com.mayiwo.mayikanshu.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminService {
    @Resource
    private AdminDao adminDao;
    public Admin login(String a_username,String a_password){
        return adminDao.login(a_username, a_password);

    }
}

