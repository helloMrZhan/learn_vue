package com.zjq.vue.utils;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zjq
 * @date 2020/3/12 19:42
 * <p>title:统一响应类</p>
 */
@JSONType(orders = {"success", "code", "message","result"})
@Data
public class ResponseVO<T>   implements Serializable {

    private boolean success;

    private int code;

    private String message;

    private T result;

    public ResponseVO(ResponseCode responseCode) {
        this.success = responseCode.success;
        this.code = responseCode.code();
        this.message = responseCode.message();
    }

    public ResponseVO(ResponseCode responseCode, T result) {
        this.success = responseCode.success;
        this.code = responseCode.code();
        this.message = responseCode.message();
        this.result = result;
    }

    public ResponseVO(boolean success, int code, String msg) {
        this.success = success;
        this.code = code;
        this.message = msg;
    }

    public ResponseVO(boolean success, int code, String msg, T result) {
        this.success = success;
        this.code = code;
        this.message = msg;
        this.result = result;
    }
}
