package cn.bdqn.hzp.controller;


import cn.bdqn.hzp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author java30
 * @date 2022/1/6
 * @apinote
 */
@Controller
public class LoginController {


    @RequestMapping("/login.html")
    public String toLog(){
        return "login";
    }
    @RequestMapping("/login")
    public Object login(User user, HttpSession session, Model model){
        if (StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getUserPassword())) {
            session.setAttribute("loginUser",user);
            return "redirect:/zhuye.html";
        }else{
            model.addAttribute("msg","用户名或密码错误!");
            return "login";
        }
    }

    @RequestMapping("/zhuye.html")
    public String main(Model model){

        return "index";
    }

}
