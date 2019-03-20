package com.wangyang.demo.entity;

public class Response {
    private String code;
    private Object data;
    private String msg;

    public Response(String code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
