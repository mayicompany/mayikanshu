package com.mayiwo.mayikanshu.service;

import com.mayiwo.mayikanshu.dao.AdminDao;
import com.mayiwo.mayikanshu.dao.UserDao;
import com.mayiwo.mayikanshu.model.Admin;
import com.mayiwo.mayikanshu.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminService {
    @Resource
    private AdminDao adminDao;
    //登陆
    public Admin login(String a_username,String a_password){
        return adminDao.login(a_username, a_password);

    }

    //管理员列表
    public List<Admin> getAdmins(){
        return adminDao.getAdmins();
    };


    /*
	 * 添加管理员账户 吴隆 2018 5 3
	 */
    public Boolean addAdmin(Admin admin) {
        boolean status = false;
        int i = adminDao.addAdmin(admin);
        if (i > 0) {
            status = true;
        }
        return status;
    }

}

