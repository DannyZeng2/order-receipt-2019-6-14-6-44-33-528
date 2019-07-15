package org.katas.refactoring;

import java.util.List;

public class Order {
    String customer;
    String address;
    List<LineItem> lineItems;

    public Order(String customer, String address, List<LineItem> lineItems) {
        this.customer = customer;
        this.address = address;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return customer;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
