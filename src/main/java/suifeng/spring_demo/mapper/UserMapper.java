package suifeng.spring_demo.mapper;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import suifeng.spring_demo.model.entity.User;

@Repository
public interface UserMapper {

    User findById(@Param("user_id") int id);

    int save(User user);
}
