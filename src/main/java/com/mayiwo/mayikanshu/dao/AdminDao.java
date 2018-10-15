package com.mayiwo.mayikanshu.dao;

import com.mayiwo.mayikanshu.model.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminDao {

    Admin login(@Param(value = "a_user") String a_user, @Param(value = "a_password") String a_password);
}
