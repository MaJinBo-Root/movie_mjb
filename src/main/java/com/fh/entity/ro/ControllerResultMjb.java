package com.fh.entity.ro;

public class ControllerResultMjb {

    private boolean status;

    private String message;

    private Object data;

    private ControllerResultMjb(){};

    private ControllerResultMjb(String message, Object data){
        this.status = true;
        this.message = message;
        this.data = data;
    }

    private ControllerResultMjb(String message){
        this.status = false;
        this.message = message;
    }

    public static ControllerResultMjb getSuccessControllerResult(String message, Object data){
        ControllerResultMjb controllerResultMjb = new ControllerResultMjb(message,data);
        return controllerResultMjb;
    }

    public static ControllerResultMjb getErrorControllerResult(String message){
        ControllerResultMjb controllerResultMjb = new ControllerResultMjb(message);
        return controllerResultMjb;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
