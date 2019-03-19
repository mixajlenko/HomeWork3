package org.shop.demo.client;

public class Customer {

    private String customerName;

    private String shipAdress;

    private String phoneNum;

    private String email;

    public Customer(String name, String shipAdress, String phoneNum, String email) {
        this.customerName = name;
        this.shipAdress = shipAdress;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getShipAdress() {
        return shipAdress;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }


}
