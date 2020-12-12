package suifeng.spring_demo.model.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Video {

    /**
     * CREATE TABLE `online_xdclass`.`Untitled`  (
     *   `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
     *   `title` varchar(524) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '视频标题',
     *   `summary` varchar(1026) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '概述',
     *   `cover_img` varchar(524) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '封面图',
     *   `price` int(11) NULL DEFAULT NULL COMMENT '价格,分',
     *   `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
     *   `point` double(11, 2) NULL DEFAULT 8.70 COMMENT '默认8.7，最高10分',
     *   PRIMARY KEY (`id`) USING BTREE
     * ) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;
     */
    int id;
    String title;
    String summary;
    String coverImg;
    int price;
    Date createTime;
    double point;

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                ", point=" + point +
                '}';
    }
}
