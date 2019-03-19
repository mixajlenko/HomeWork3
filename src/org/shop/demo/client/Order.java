package org.shop.demo.client;

public class Order {

    private int orderNum; //null

    private String orderDate; //null

    private Customer shipAdress;

    private double orderPrice; //null

    private int orderValue; //null

    private String orderedStatus; //null

    private String orderedBy;

    public Order(int orderNum, String orderDate, double orderPrice, int orderValue, String ortderStatus, boolean payStatus, String orderedBy) {
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
        this.orderValue = orderValue;
        this.orderedStatus = ortderStatus;
        this.orderedBy = orderedBy;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public int getOrderValue() {
        return orderValue;
    }

    public String getOrtderStatus() {
        return orderedStatus;
    }

}




