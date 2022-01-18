package cn.bdqn.hzp.service.user;

import cn.bdqn.hzp.pojo.User;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

/**
 * @author java30
 * @date 2022/1/11
 * @apinote
 */
public interface UserService {
    /**
     * 按name查询
     * @param userName
     * @return
     */
    public List<User> getUser(String userName);

    /**
     * 分页显示，返回页面详情信息
     * @param pageNum  当前页码
     * @param pageSize  每页显示的数量
     * @return  页面量信息
     */
    public PageInfo<User> selAllByPage(int pageNum, int pageSize);

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    public Boolean delUserId(Integer id);
    /**
     * id查询
     * @param id
     * @return
     */
    public User getUserById(Integer id);
    /**
     * 根据id修改用户
     * @param id
     * @param pwd
     * @return
     */
    public Boolean upUserById(Integer id,String pwd);
    /**
     * 添加用户
     * @param user
     * @return
     */
    public Boolean addUser(User user);
}
