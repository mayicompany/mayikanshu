package dao;

import com.mayiwo.mayikanshu.dao.AdminDao;
import com.mayiwo.mayikanshu.model.Admin;
import com.mayiwo.mayikanshu.test.SpringJunitTest;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;


public class AdminDaoTest extends SpringJunitTest{
    @Resource
    private AdminDao adminDao;
    //登陆测试
    @Test
    public void loginTest1(){
        Admin admin=adminDao.login("dashuo","123456");
        System.out.println(admin.getA_name());
    }
    //管理员列表测试
    @Test
    public void getadminsTest(){
        List<Admin> adminList=adminDao.getAdmins();
        System.out.println(adminList);
    }
}
