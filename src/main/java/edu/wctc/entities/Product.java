package edu.wctc.entities;

import org.springframework.util.StringUtils;

public class Product {
    private String name;
    private Integer cost;
    private Integer quantity;

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    private final String[] productToStringArray() {
        return new String[] {name, cost.toString(), quantity.toString()};
    }

    @Override
    public String toString() {
        return StringUtils.arrayToCommaDelimitedString(productToStringArray());
    }
}
