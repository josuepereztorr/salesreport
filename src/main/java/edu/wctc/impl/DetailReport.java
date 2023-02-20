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
        out.fOutput(
                "----------------------------------------------------------------------------------------%n");
        out.fOutput("                                  SALES DETAIL REPORT %n");
        out.fOutput(
                "----------------------------------------------------------------------------------------%n");
        out.fOutputArgs("%-25S%-20S%-20S%-15S%S%n", "Customer",
                "Country", "Amount", "Tax", "Shipping");
        for (Sale sale : salesList) {
            out.fOutputArgs("%-24s  %-18s  %-18.2f  %-13.2f  %.2f%n",
                    sale.getCustomerName(), sale.getCountry(), sale.getTotalAmount(),
                    sale.getTax(), sale.getShippingCost());
        }
        out.fOutput(
                "----------------------------------------------------------------------------------------%n");
        out.fOutput("%n");
    }
}
