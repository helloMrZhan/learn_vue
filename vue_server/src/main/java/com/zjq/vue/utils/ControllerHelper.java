package com.zjq.vue.utils;

/**
 * @author zjq
 * @date 2020/6/10 19:42
 * <p>title:controller辅助类</p>
 * <p>description:controller辅助类</p>
 */
public class ControllerHelper {

    public ControllerHelper() {
    }


    public static ResponseVO success() {
        return new ResponseVO(ResponseCode.SUCCESS.success(),ResponseCode.SUCCESS.code() ,ResponseCode.SUCCESS.message());
    }

    public static <T> ResponseVO success(T result) {
        return new ResponseVO(ResponseCode.SUCCESS.success(),ResponseCode.SUCCESS.code() ,ResponseCode.SUCCESS.message(),result);
    }

    public static <T> ResponseVO success(String msg,T result) {
        return new ResponseVO(ResponseCode.SUCCESS.success(),ResponseCode.SUCCESS.code(), msg, result);
    }

    public static <T> ResponseVO error(String msg) {
        return new ResponseVO(ResponseCode.UNKNOWN_ERROR, msg);
    }

    public static <T> ResponseVO siteInfoError(Boolean flag, Integer code, String msg) {
        return new ResponseVO(flag, code, msg);
    }

    public static <T> ResponseVO error(ResponseCode responseCode) {
        return new ResponseVO(responseCode);
    }

    public static <T> ResponseVO info(ResponseCode responseCode) {
        return new ResponseVO(responseCode);
    }

    public static <T> ResponseVO info(ResponseCode responseCode,T result) {
        return new ResponseVO(responseCode,result);
    }

}