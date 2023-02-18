package edu.wctc;

import edu.wctc.entities.Product;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private String customerName;
    private String country;
    private Double totalAmount;
    private Double tax;
    private Double shippingCost;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public void setShippingCost(Double shippingCost) {
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
