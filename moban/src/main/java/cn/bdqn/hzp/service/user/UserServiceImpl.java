package cn.bdqn.hzp.service.user;


import cn.bdqn.hzp.mapper.UserMapper;
import cn.bdqn.hzp.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author java30
 * @date 2022/1/10
 * @apinote
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUser(String userName){
        return userMapper.getUser(userName);
    }


    @Override
    public Boolean delUserId(Integer id) {
        return userMapper.delUserId(id)>0;
    }
    /**
     * id查询
     * @param id
     * @return
     */
    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    /**
     * 分页显示，返回页面详情信息
     * @param pageNum  当前页码
     * @param pageSize  每页显示的数量
     * @return  页面量信息
     */
    @Override
    public PageInfo<User> selAllByPage(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> listUser = userMapper.selAllByPage();
        PageInfo<User> pageInfo = new PageInfo<>(listUser);
        return pageInfo;
    }
    /**
     * 根据id修改用户
     * @param id
     * @param pwd
     * @return
     */
    @Override
    public Boolean upUserById(Integer id,String pwd){
        return userMapper.upUserById(id,pwd)>0;
    }
    /**
     * 添加用户
     * @param user
     * @return
     */
    @Override
    public Boolean addUser(User user){
        return userMapper.addUser(user)>0;
    }
}
