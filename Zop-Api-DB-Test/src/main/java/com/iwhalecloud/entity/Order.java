package com.iwhalecloud.entity;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

    private int orderId;

    private String orderName;

    private Date createDate;

    private String userName;


    public Order() {
    }

    public Order(int orderId, String orderName, Date createDate) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.createDate = createDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
