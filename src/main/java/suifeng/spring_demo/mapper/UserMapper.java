package suifeng.spring_demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import suifeng.spring_demo.model.entity.User;


@Repository
public interface UserMapper {

    User findById(@Param("user_id") int id);

    int save(User user);

    User queryUserOrder(@Param("user_id") int id);

    User findByPhonePwd(@Param("phone") String phone,@Param("pwd") String pwd);
}
