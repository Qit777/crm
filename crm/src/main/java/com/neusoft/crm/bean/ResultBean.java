package com.neusoft.crm.bean;

public class ResultBean {
    public enum ResultType{
        SUCCESS,ERROR,FAIL
    }
    private Integer code;
    private String message;
    private Object object;

    public ResultBean(){
        this.code=200;
        this.message="success";
    }


    public ResultBean(ResultType type){
        if(type==ResultType.ERROR){
            this.code=500;
            this.message="服务器错误";
        }
        else if (type==ResultType.FAIL){
            this.code=300;
            this.message="操作失败";
        }
        else if (type==ResultType.SUCCESS){
            this.code=200;
            this.message="操作成功";
        }
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
