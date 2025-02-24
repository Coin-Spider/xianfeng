package com.rum.xianfeng.Service.Impl;

import com.rum.xianfeng.Core.Exception.ApiExcept;
import com.rum.xianfeng.Core.Exception.XFexception;
import com.rum.xianfeng.Entity.User;
import com.rum.xianfeng.Mapper.UserMapper;
import com.rum.xianfeng.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired private UserMapper userMapper;

    //用户注册
    @Override
    public User Register(String userPhone) {
        if (userMapper.findByUserPhone(userPhone)!=null){
            throw new XFexception(ApiExcept.UserExist);
        }
        //异步
        String nickName=userMapper.searchName_1()+"的"+userMapper.searchName_2();

        return null;
    }

}
