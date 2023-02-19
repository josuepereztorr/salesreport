package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesInput;
import edu.wctc.iface.SystemInput;
import edu.wctc.iface.SystemOutput;

import java.util.ArrayList;
import java.util.List;

public class ConsoleReader implements SalesInput {

    private final SystemInput in;
    private final SystemOutput out;

    public ConsoleReader(SystemInput in, SystemOutput out) {
        this.in = in;
        this.out = out;
    }

    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        String promptValue;

        do {
            Sale sale = new Sale();
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
            Double shippingCost = Double.valueOf(in.getInput("Enter the shippingCost: "));
            sale.setShippingCost(shippingCost);
            sales.add(sale);
            out.output("");

            promptValue = in.getInput("Do you want to enter another sale? " +
                    "(y/n) ").toLowerCase();
            out.output("");
        } while(promptValue.equalsIgnoreCase("y"));

        return sales;
    }
}
