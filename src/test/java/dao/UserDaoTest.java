package dao;

import com.mayiwo.mayikanshu.dao.UserDao;
import com.mayiwo.mayikanshu.model.User;
import com.mayiwo.mayikanshu.test.SpringJunitTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


public class UserDaoTest extends SpringJunitTest{
    @Resource
    private UserDao userDao;
    @Test
    public void getUsersTest() {
        System.out.println(userDao.getUsers());
    }
}
