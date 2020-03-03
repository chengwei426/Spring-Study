package com.iwhalecloud.common;

import java.io.Serializable;

/**
 * @Description 返回响应的定义 <br>
 * @author cheng.wei <br>
 * @version 1.0<br>
 * @taskId $ <br>
 * @CreateDate 2019/12/24 <br>
 * @since <br>
 * @see BaseResponse <br>
 */
public class BaseResponse implements Serializable {

    // 响应状态码
    private String resCode;

    // 响应状态码对应信息
    private String resMessage;

    public BaseResponse() {
    }

    public BaseResponse(String resCode) {
        this.resCode = resCode;
    }

    public BaseResponse(String resCode, String resMessage) {
        this.resCode = resCode;
        this.resMessage = resMessage;
    }


    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResMessage() {
        return resMessage;
    }

    public void setResMessage(String resMessage) {
        this.resMessage = resMessage;
    }
}
