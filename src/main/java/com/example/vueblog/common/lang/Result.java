package com.example.vueblog.common.lang;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {

    private int code;
    private String msg;
    private Object data;

    // Operate Successfully
    public static Result succ(Object data){
        return sendReturn(200, "Operate successfully~~", data);
    }

    // Operate failed
    public static Result fail(String msg){
        return sendReturn(400, msg, null);
    }

    // Send message back
    public static Result sendReturn(int code, String msg, Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(int code, String msg, Object data) {
        return sendReturn(code, msg, data);
    }
}
