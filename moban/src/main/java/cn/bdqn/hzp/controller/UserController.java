package cn.bdqn.hzp.controller;

import cn.bdqn.hzp.pojo.User;
import cn.bdqn.hzp.service.user.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author java30
 * @date 2022/1/11
 * @apinote
 */
@Controller("/user")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/userlist")
    public List<User> getlist(@RequestParam(name = "userName",required = false)String userName){
        return userService.getUser(userName);
    }


    @ResponseBody
    @RequestMapping("/pagelist")
    public PageInfo<User> getlist(@RequestParam(defaultValue = "1")int pageNum){
        //int pagenum = 0;
        //if (pageNum<0){
        //    pagenum=1;
        //}
        return userService.selAllByPage(pageNum,5);
    }

    @ResponseBody
    @RequestMapping("/deluser")
    public Map delUser(@RequestParam(name = "id",required = true)int id){
        boolean b = userService.delUserId(id);
        Map<String,Object> map = new HashMap<>();
        map.put("flag",b);
        return map;
    }
    @ResponseBody
    @RequestMapping("/getuserbyid")
    public User getUserById(@RequestParam(name = "id")int id){
        return userService.getUserById(id);
    }

    @ResponseBody
    @RequestMapping("/updateuser")
    public Map updateUser(@RequestParam(name = "id")int id,
                          @RequestParam(name = "pass")String pass){
        boolean b = userService.upUserById(id,pass);
        Map<String,Object> map = new HashMap<>();
        map.put("flag",b);
        return map;
    }

    @ResponseBody
    @RequestMapping("/adduser")
    public Map addUser(User user){
        boolean b = userService.addUser(user);
        Map<String,Object> map = new HashMap<>();
        map.put("flag",b);
        return map;
    }
}
