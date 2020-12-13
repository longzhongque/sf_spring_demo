package suifeng.spring_demo.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    /**
     * CREATE TABLE `onine_xdclass`.`Untitled`  (
     *   `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
     *   `name` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
     *   `pwd` varchar(124) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
     *   `head_img` varchar(524) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
     *   `phone` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '手机号',
     *   `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
     *   PRIMARY KEY (`id`) USING BTREE,
     *   UNIQUE INDEX `phone`(`phone`) USING BTREE
     * ) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;
     */

    private int id;
    private String name;
    @JsonIgnore
    private String pwd;
    private String headImg;
    private String phone;
    private Date createTime;
    private List<VideoOrder>videoOrders;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", headImg='" + headImg + '\'' +
                ", phone='" + phone + '\'' +
                ", createTime=" + createTime +
                ", videoOrders=" + videoOrders +
                '}';
    }
}
