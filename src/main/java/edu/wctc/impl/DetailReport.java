package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesReport;
import edu.wctc.iface.SystemOutput;

import java.util.List;

public class DetailReport implements SalesReport {

    private final SystemOutput outf;


    public DetailReport(SystemOutput out) {
        this.outf = out;
    }

    @Override
    public void generateReport(List<Sale> salesList) {
        outf.outputf(
                "----------------------------------------------------------------------------------------%n");
        outf.outputf("                                  SALES DETAIL REPORT %n");
        outf.outputf(
                "----------------------------------------------------------------------------------------%n");
        outf.outputf("%-25S%-20S%-20S%-15S%S%n", "Customer",
                "Country", "Amount", "Tax", "Shipping");
        for (Sale sale : salesList) {
            outf.outputf("%-24s  %-18s  %-18.2f  %-13.2f  %.2f%n",
                    sale.getCustomerName(), sale.getCountry(), sale.getTotalAmount(),
                    sale.getTax(), sale.getShippingCost());
        }
        outf.outputf(
                "----------------------------------------------------------------------------------------%n");
        outf.outputf("%n");
    }
}
