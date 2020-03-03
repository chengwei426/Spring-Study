package com.iwhalecloud.entity;

import java.util.Date;

public class ApiPerformanceTesting {
    private Integer id;

    private Integer sleepTime;

    private String ifSleep;

    private String ifUseResponse;

    private String responseBody;

    private String testCode;

    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(Integer sleepTime) {
        this.sleepTime = sleepTime;
    }

    public String getIfSleep() {
        return ifSleep;
    }

    public void setIfSleep(String ifSleep) {
        this.ifSleep = ifSleep;
    }

    public String getIfUseResponse() {
        return ifUseResponse;
    }

    public void setIfUseResponse(String ifUseResponse) {
        this.ifUseResponse = ifUseResponse;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public String getTestCode() {
        return testCode;
    }

    public void setTestCode(String testCode) {
        this.testCode = testCode;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
