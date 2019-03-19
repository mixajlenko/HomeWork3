
package org.shop.demo.shop;

import org.shop.demo.client.Customer;

public class Seller {

    private String sellerName;

    private Product[][] products;

    public Seller(String sellerName, Product[] [] products) {
        this.sellerName = sellerName;
        this.products = products;
    }

    public boolean order(int classerOfFrash, int Bananas, Customer customer) {

        if (
                classerOfFrash > 0
                        && Bananas > 0
                        && products.length >= classerOfFrash
                        && products[classerOfFrash - 1].length >= Bananas
        ) {
            Product order = products[classerOfFrash][Bananas];
            return order.orderTheBananas(customer);
        }
        return false;
    }
}
