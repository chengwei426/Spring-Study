package com.iwhalecloud.common;

public class ResponseData<T> extends BaseResponse {

    // 响应的消息体
    private T data;

    public ResponseData() {
    }

    public ResponseData(String resCode, String resMessage) {
        super(resCode, resMessage);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
