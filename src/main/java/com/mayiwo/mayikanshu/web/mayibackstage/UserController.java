package com.mayiwo.mayikanshu.web.mayibackstage;

import com.mayiwo.mayikanshu.model.User;
import com.mayiwo.mayikanshu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/mayikanshu")
public class UserController {

        @Resource
        private UserService userService;

        //管理员列表
        @RequestMapping(value = "/userlist" ,method= RequestMethod.GET)
        public String getUsers(HttpServletRequest request){
            List<User> userList=userService.getUsers();
            request.setAttribute("userList",userList);
            return "mayibackstage/usermanage.jsp";
        }




}
