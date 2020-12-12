package suifeng.spring_demo.model.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class VideoOrder {
    /**
     * CREATE TABLE `online_xdclass`.`Untitled`  (
     *   `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
     *   `out_trade_no` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单唯一标识',
     *   `state` int(11) NULL DEFAULT NULL COMMENT '0表示未支付，1表示已支付',
     *   `create_time` datetime NULL DEFAULT NULL COMMENT '订单生成时间',
     *   `total_fee` int(11) NULL DEFAULT NULL COMMENT '支付金额，单位分',
     *   `video_id` int(11) NULL DEFAULT NULL COMMENT '视频主键',
     *   `video_title` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '视频标题',
     *   `video_img` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '视频图片',
     *   `user_id` int(12) NULL DEFAULT NULL COMMENT '用户id',
     *   PRIMARY KEY (`id`) USING BTREE
     * ) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;
     */
    private int id;
    String outTradeNo;
    int state;
    Date createTime;
    int totalFee;
    int videoId;
    String videoTitle;
    String videoImg;
    int UserId;
    User user;

    @Override
    public String toString() {
        return "VideoOrder{" +
                "id=" + id +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", state=" + state +
                ", createTime=" + createTime +
                ", totalFee=" + totalFee +
                ", videoId=" + videoId +
                ", videoTitle='" + videoTitle + '\'' +
                ", videoImg='" + videoImg + '\'' +
                ", UserId=" + UserId +
                '}';
    }
}
