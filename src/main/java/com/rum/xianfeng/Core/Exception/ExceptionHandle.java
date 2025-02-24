package com.rum.xianfeng.Core.Exception;

import com.rum.xianfeng.Core.Re;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
@ResponseBody
@Controller
public class ExceptionHandle {
    @ExceptionHandler(XFexception.class)
    public final Re handleAllExceptions(XFexception ex) {
        return new Re(ex.getErrorCode(),ex.getMessage());
    }
}