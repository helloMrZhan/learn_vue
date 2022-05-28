package com.zjq.vue.utils;

/**
 * @author zjq
 * @date 2020/3/12 20:42
 * <p>title:状态码枚举</p>
 */
public enum ResponseCode {

    SUCCESS(true,200,"操作成功！"),
    //---系统错误返回码-----
    FAIL(false,10001,"操作失败"),
    UNKNOWN_ERROR(false,500,"服务器内部出错");
    /**
     * 操作是否成功
     */
    boolean success;
    /**
     * 操作代码
     */
    int code;
    /**
     * 提示信息
     */
    String message;

    ResponseCode(boolean success, int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean success() {
        return success;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }

}