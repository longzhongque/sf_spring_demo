package suifeng.spring_demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import suifeng.spring_demo.mapper.UserMapper;
import suifeng.spring_demo.model.entity.User;
import suifeng.spring_demo.service.UserService;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper userMapper;

    @Override
    public int save(@RequestBody Map<String, String> userInfo) {
        User user = parseToUser(userInfo);
        if(user != null){
            return userMapper.save(user);
        }else {
            return -1;
        }
    }

    @Override
    public int login(User user) {
        return 0;
    }

    @Override
    public User findById(int id) {
        User user = userMapper.findById(id);
        return user;
    }

    @Override
    public List<User> listUser() {
        return null;
    }

    @Override
    public List<User> listUserOrder() {
        return null;
    }

    /**
     * 解析USer
     */
    private User parseToUser(Map<String,String> userInfo){
        if(userInfo.containsKey("phone")&&userInfo.containsKey("name")&&userInfo.containsKey("pwd")){
            User user = new User();
            user.setName(userInfo.get("name"));
            user.setPhone(userInfo.get("phone"));
            user.setPwd(userInfo.get("pwd"));
            user.setCreateTime(new Date());
            user.setHeadImg(getRandomImg());
            return user;
        }else {
            return null;
        }
    }

    private static final String [] headImg = {
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/12.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/11.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/13.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/14.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/15.jpeg"
    };

    private String getRandomImg(){
        int size = headImg.length;
        Random random = new Random();
        int index = random.nextInt(size);
        return headImg[index];
    }
}
