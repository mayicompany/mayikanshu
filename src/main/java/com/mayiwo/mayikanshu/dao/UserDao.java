package com.mayiwo.mayikanshu.dao;

import com.mayiwo.mayikanshu.model.User;

import java.util.List;

public interface UserDao {
      //查询数据库中user表的所有记录
     List<User> getUsers();

}
