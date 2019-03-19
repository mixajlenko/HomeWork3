package org.shop.demo.shop;

import org.shop.demo.client.Customer;

public class Product {

    private String productName;

    private Double productPrice;

    private int availability;

    private Customer orderedBy;

    public Product(String productName) {
        this.productName = productName;
    }

    public boolean orderTheBananas(Customer customer) {
        if (availability > 0) {
            return true;
        } else if (availability < 0) {
            return false;

        }
        return false;

        }


    }




