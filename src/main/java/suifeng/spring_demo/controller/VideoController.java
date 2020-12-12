package suifeng.spring_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import suifeng.spring_demo.model.entity.Video;
import suifeng.spring_demo.model.entity.VideoOrder;
import suifeng.spring_demo.service.VideoService;

import java.util.List;

@RestController
@RequestMapping("video")
public class VideoController {

    @Autowired
    VideoService videoService;

    @GetMapping("delete")
    public Integer delete(int id){
        int row = videoService.delete(id);
        return row;
    }
    @GetMapping("list")
    public List list(){
        List<Video> list = videoService.videoList();
        return list;
    }
    @GetMapping("video_orderById")
    public VideoOrder orderById(int id){
        VideoOrder videoOrder = videoService.orderById(id);
        return videoOrder;
    }
}
