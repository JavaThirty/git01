package cn.bdqn.hzp.mapper;

import cn.bdqn.hzp.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author java30
 * @date 2022/1/10
 * @apinote
 */
@Mapper
public interface UserMapper {
    /**
     * 按name查询
     * @param userName
     * @return
     */
    public List<User> getUser(String userName);
    /**
     * id查询
     * @param id
     * @return
     */
    public User getUserById(Integer id);
    /**
     * 分页查询所有
     * @return
     */
    public List<User> selAllByPage();

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    public int delUserId(Integer id);

    /**
     * 根据id修改用户
     * @param id
     * @param pwd
     * @return
     */
    public int upUserById(Integer id,String pwd);

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user);
}
