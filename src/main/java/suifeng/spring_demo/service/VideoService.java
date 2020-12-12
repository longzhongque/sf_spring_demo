package suifeng.spring_demo.service;

import suifeng.spring_demo.model.entity.Video;
import suifeng.spring_demo.model.entity.VideoOrder;

import java.util.List;

/**
 * video 管理
 */
public interface VideoService {

    int delete(int id);

    List<Video> videoList();

    VideoOrder orderById(int id);
}
