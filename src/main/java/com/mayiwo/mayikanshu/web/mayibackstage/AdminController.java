package com.mayiwo.mayikanshu.web.mayibackstage;

import com.mayiwo.mayikanshu.model.Admin;
import com.mayiwo.mayikanshu.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/mayikanshu")
public class AdminController {

    @Resource
    private AdminService adminService;

    //登陆
    @RequestMapping(value = "/login" ,method= RequestMethod.POST)
    public String login(String a_user, String a_password, HttpSession session){
        Admin admin=adminService.login(a_user,a_password);
        if(admin!=null){//如果对象不为null,表示登录成功
            session.setAttribute("admin", admin);
          return "mayibackstage/index.jsp";
        }else{//如果登录失败
           return "mayibackstage/login.jsp";
        }
    }


    //管理员列表
    @RequestMapping(value = "/adminlist" ,method= RequestMethod.GET)
    public String getAdmins(HttpServletRequest request){
        List<Admin> adminList=adminService.getAdmins();
        request.setAttribute("adminList",adminList);
        return "mayibackstage/admin.jsp";
    }


    /*
	 * 添加管理员账户
	 *吴隆
	 * @author
	 */
    @RequestMapping(value = "/doAddAdmin", method = RequestMethod.POST)
    public String doAddAdmin(HttpServletRequest request, Admin admin, HttpSession session) {
        if (admin.getA_name().equals("")) {
            request.setAttribute("massage", "添加失败：姓名不能为空！！");
        } else if (admin.getA_user().equals("")) {
            request.setAttribute("massage", "添加失败：网名不能为空！！");
        } else {
            Boolean status = adminService.addAdmin(admin);
            if (status) {
                request.setAttribute("massage", "添加成功");
            }
        }


        return "jsp/admin/adminmanage/adminadd.jsp";
    }

}
