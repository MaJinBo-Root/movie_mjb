package com.fh.global.exception.handleException;

import com.fh.entity.ro.ControllerResultMjb;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ControllerResultMjb doException(Exception e){
        e.printStackTrace();
        ControllerResultMjb errorControllerResultMjb = ControllerResultMjb.getErrorControllerResult(e.getMessage());
        return errorControllerResultMjb;
    }

}
