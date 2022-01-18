package cn.bdqn.hzp.controller;

import cn.bdqn.hzp.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author java30
 * @date 2022/1/11
 * @apinote
 */
@Controller
public class ToController {

    @RequestMapping("/plist")
    public String towelcom(Model model){

        return "plist";
    }
    @RequestMapping("/upuser")
    public String toUpdate(Model model){

        return "update";
    }
    @RequestMapping("/toadd")
    public String toAddUser(@ModelAttribute("user") User u ){

        return "add";
    }
}
