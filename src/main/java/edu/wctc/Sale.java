package edu.wctc;

import edu.wctc.entities.Product;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private String firstName;
    private String lastName;
    private String country;
    private final List<Product> products = new ArrayList<>();

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    private final String[] saleToStringArray() {
        return new String[] {firstName, lastName, country};
    }

    @Override
    public String toString() {
        return StringUtils.arrayToCommaDelimitedString(saleToStringArray());
    }
}
