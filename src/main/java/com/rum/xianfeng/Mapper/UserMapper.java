package com.rum.xianfeng.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rum.xianfeng.Entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper extends BaseMapper<User> {
//    检验是否存在
    List<User> findByUserPhone(String userPhone);
    String searchName_1();
    String searchName_2();
}
