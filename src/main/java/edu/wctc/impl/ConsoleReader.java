package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesInput;
import edu.wctc.iface.SystemInput;
import edu.wctc.iface.SystemOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ConsoleReader implements SalesInput {

    private final SystemInput in;
    private final SystemOutput out;

    @Autowired
    public ConsoleReader(SystemInput in, SystemOutput out) {
        this.in = in;
        this.out = out;
    }

    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        Sale sale = new Sale();
        String promptValue;

        do {
            out.output("");
            out.output("New Sale");
            out.output("--------");
            String customerName = in.getInput("Enter the customers name: ");
            sale.setCustomerName(customerName);
            String country = in.getInput("Enter the country: ");
            sale.setCountry(country);
            Double totalAmount = Double.valueOf(in.getInput("Enter the total sale amount: "));
            sale.setTotalAmount(totalAmount);
            Double tax = Double.valueOf(in.getInput("Enter the tax amount: "));
            sale.setTax(tax);
            Double shippingCost = Double.valueOf("Enter the shippingCost: ");
            sale.setShippingCost(shippingCost);
            sales.add(sale);
            out.output("");

            promptValue = in.getInput("Do you want to enter another sale? " +
                    "(y/n)").toLowerCase();
            out.output("");
        } while(promptValue.equalsIgnoreCase("y"));

        out.output("");

        return sales;
    }
}
