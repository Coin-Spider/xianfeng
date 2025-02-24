package com.rum.xianfeng.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private int userId;
    private String nickName;
    private String userPhone;
    @TableField(exist = false)
    private String userPhone_No;
    private String salt;
    private int headId;
    @TableField(exist = false)
    private String headImg;
    private String address;

    public User() {
    }

    public User(int userId, String nickName, String userPhone, String userPhone_No, String salt, int headId, String headImg, String address) {
        this.userId = userId;
        this.nickName = nickName;
        this.userPhone = userPhone;
        this.userPhone_No = userPhone_No;
        this.salt = salt;
        this.headId = headId;
        this.headImg = headImg;
        this.address = address;
    }
}
