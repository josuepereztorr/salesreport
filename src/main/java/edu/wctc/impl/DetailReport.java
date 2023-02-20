package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesReport;
import edu.wctc.iface.SystemFormattedOutput;

import java.util.List;

public class DetailReport implements SalesReport {

    private final SystemFormattedOutput out;


    public DetailReport(SystemFormattedOutput out) {
        this.out = out;
    }

    @Override
    public void generateReport(List<Sale> salesList) {
        out.fOutput("----------------------------------------------------------------------%n");
        out.fOutput("                          SALES DETAIL REPORT                         %n");
        out.fOutput("----------------------------------------------------------------------%n");
        out.fOutputArgs("| %-20S | %-15S | %-5S | %-5S | %-5S |%n", "Customer", "Country", "Amount", "Tax", "Shipping");
        out.fOutput("----------------------------------------------------------------------%n");
        salesList.forEach(
               s -> out.fOutputArgs("%-20s %-15s %,.2f %,.2f %,.2f", s.getCustomerName(), s.getCountry(), s.getTotalAmount(), s.getTax(), s.getShippingCost())
        );
//        for (Sale sale : salesList) {
//            System.out.printf("%-20s %-15s %n", sale.getCustomerName(), sale.getCountry());
//        }

//        System.out.printf("--------------------------------%n");
//        System.out.printf(" Java's Primitive Types         %n");
//        System.out.printf(" (printf table example)         %n");
//
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");
//        System.out.printf("--------------------------------%n");
//
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "double",  64);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "float",   32);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "long",    64);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "int",     32);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "char",    16);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "short",   16);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "byte",    8);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Boolean",  "boolean", 1);
//
//        System.out.printf("--------------------------------%n");
    }
}
