package com.crdcs.workbench.model;

/**
 * @Author: zxm
 * @Date: 2019/11/27 14:51
 */
public class Result {
    private int status;
    private String msg;
    private Object fields;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    private void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getFields() {
        return fields;
    }

    private void setFields(Object fields) {
        this.fields = fields;
    }

    public Result() {
    }

    private Result(int status) {
        this.status = status;
    }

    private Result(int status, String msg) {
        this(status);
        this.setMsg(msg);
    }
    private Result(int status, String msg,Object fields) {
        this(status,msg);
        this.setFields(fields);
    }


    public static Result build(int status) {
        return new Result(status);
    }

    public static Result build(int status, String msg) {
        return new Result(status, msg);
    }

    public static Result build(int status, String msg,Object fields) {
        return new Result(status, msg,fields);
    }

}
