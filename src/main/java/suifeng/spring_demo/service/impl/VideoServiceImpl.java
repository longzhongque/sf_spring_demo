package suifeng.spring_demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import suifeng.spring_demo.mapper.VideoMapper;
import suifeng.spring_demo.mapper.VideoOrderMapper;
import suifeng.spring_demo.model.entity.Video;
import suifeng.spring_demo.model.entity.VideoOrder;
import suifeng.spring_demo.service.VideoService;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    VideoMapper videoMapper;
    @Autowired
    VideoOrderMapper videoOrderMapper;

    @Override
    public int delete(int id) {
        return videoMapper.delete(id);
    }

    @Override
    public List<Video> videoList() {
        List<Video> list = videoMapper.videoList();
        return list;
    }

    @Override
    public VideoOrder orderById(int id) {
        VideoOrder videoOrder = videoOrderMapper.orderById(id);
        return videoOrder;
    }
}
