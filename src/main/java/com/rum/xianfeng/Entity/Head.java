package com.rum.xianfeng.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("head")
public class Head {
    @TableId(type = IdType.AUTO)
    private int headId;
    private String picUrl;

    public Head(int headId, String picUrl) {
        this.headId = headId;
        this.picUrl = picUrl;
    }

    public Head() {
    }
}
