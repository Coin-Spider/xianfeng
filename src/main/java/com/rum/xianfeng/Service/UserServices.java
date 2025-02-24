package com.rum.xianfeng.Service;

import com.rum.xianfeng.Entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserServices {
    public User Register (String userPhone);
}
