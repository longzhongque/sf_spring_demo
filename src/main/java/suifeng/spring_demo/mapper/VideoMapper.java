package suifeng.spring_demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import suifeng.spring_demo.model.entity.Video;

import java.util.List;

@Repository
public interface VideoMapper {

    int delete(@Param("video_id") int id);

    List<Video> videoList();
}
