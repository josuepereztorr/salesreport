package edu.wctc;

import org.springframework.util.StringUtils;

public class Sale {
    private String customerName;
    private String country;
    private Double totalAmount;
    private Double tax;
    private Double shippingCost;

    public Sale(String customerName, String country, Double totalAmount, Double tax) {
        this.customerName = customerName;
        this.country = country;
        this.totalAmount = totalAmount;
        this.tax = tax;
    }

    public Sale() {
    }

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

    public String getCustomerName() {
        return customerName;
    }

    public String getCountry() {
        return country;
    }

    public Double getTax() {
        return tax;
    }

    public Double getShippingCost() {
        return shippingCost;
    }

    public Double getTotalAmount() {
        return totalAmount;
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
