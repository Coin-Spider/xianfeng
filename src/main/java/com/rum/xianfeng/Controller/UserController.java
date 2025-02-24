package com.rum.xianfeng.Controller;

import com.rum.xianfeng.Core.Exception.ApiExcept;
import com.rum.xianfeng.Core.Exception.XFexception;
import com.rum.xianfeng.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.io.File;

@RestController
@RequestMapping("/User")
public class UserController {


    /**
     * 用户注册
     * @param userPhone 用户电话号码
     * @return 用户Json信息
     */
    @PostMapping("/Register")
    public String UserRegister(String userPhone){
        if (userPhone.length()!=11){
            throw new XFexception(ApiExcept.PhoneWrong);
        }

        return "success";
    }

}
