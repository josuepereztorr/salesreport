package edu.wctc;

import edu.wctc.entities.Product;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private String customerName;
    private String country;
    private Integer totalAmount;
    private Integer tax;
    private Integer shippingCost;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public void setShippingCost(Integer shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public String toString() {
        return StringUtils.arrayToCommaDelimitedString(
                new String[] {
                        customerName,
                        country,
                        totalAmount.toString(),
                        tax.toString(),
                        shippingCost.toString()
                });
    }
}
