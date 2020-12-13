package suifeng.spring_demo.service;

import suifeng.spring_demo.model.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    /**
     * 注册
     * @param userInfo
     * @return
     */
    int save(Map<String, String> userInfo);

    /**
     * 登录
     * @param user
     * @return
     */
    int login(User user);
    /**
     * 查询根据id
     */
    User findById(int id);

    /**
     * 用户列表
     * @return
     */
    List<User> listUser();
    /**
     * 关联查询 根据orderid查询
     */
    List<User> listUserOrder();
    /**
     * 查询所有用户的全部信息
     */
    User queryUserOrder(int id);

    String findByPhonePwd(String phone, String pwd);
}
