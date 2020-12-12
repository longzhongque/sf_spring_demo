package suifeng.spring_demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import suifeng.spring_demo.model.entity.VideoOrder;

@Repository
public interface VideoOrderMapper {

    VideoOrder orderByUserId(@Param("user_id") int id);

    VideoOrder orderById(@Param("order_id") int id);

}
