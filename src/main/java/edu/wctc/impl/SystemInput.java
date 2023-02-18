package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesInput;
import edu.wctc.iface.SalesReportInput;
import edu.wctc.iface.SalesReportOutput;

import java.util.ArrayList;
import java.util.List;

public class SystemInput implements SalesInput {

    private SalesReportInput in;
    private SalesReportOutput out;

    public SystemInput(SalesReportInput in, SalesReportOutput out) {
        this.in = in;
        this.out = out;
    }

    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        Sale sale = new Sale();

        out.output("");
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
//        out.output("");

        String promptValue = in.getInput("Do you want to enter another sale? " +
                "(y/n)").toLowerCase();

        while(promptValue.equals("y")) {
            out.output("");
            customerName = in.getInput("Enter the customers name: ");
            sale.setCustomerName(customerName);
            country = in.getInput("Enter the country: ");
            sale.setCountry(country);
            totalAmount = Double.valueOf(in.getInput("Enter the total sale amount: "));
            sale.setTotalAmount(totalAmount);
            tax = Double.valueOf(in.getInput("Enter the tax amount: "));
            sale.setTax(tax);
            shippingCost = Double.valueOf("Enter the shippingCost: ");
            sale.setShippingCost(shippingCost);
            out.output("");

           promptValue = in.getInput("Do you want to enter another sale? " +
                    "(y/n)").toLowerCase();
        }

        return sales;
    }
}
