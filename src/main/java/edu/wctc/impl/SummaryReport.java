package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesReport;
import edu.wctc.iface.SystemFormattedOutput;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

public class SummaryReport implements SalesReport {

    private final SystemFormattedOutput out;

    public SummaryReport(SystemFormattedOutput out) {
        this.out = out;
    }

    @Override
    public void generateReport(List<Sale> salesList) {
        out.fOutput(
                "----------------------------------------------------------------------------------------%n");
        out.fOutput("                                  SALES SUMMARY REPORT %n");
        out.fOutput(
                "----------------------------------------------------------------------------------------%n");
        out.fOutputArgs("%-20S%-20S%-15S%S%n",
                "Country", "Amount", "Tax", "Shipping");

        Map<String, List<Sale>> salesByCountry =
                salesList.stream().collect(groupingBy(Sale::getCountry));

        salesByCountry.keySet().forEach(
                k -> out.fOutputArgs("%-19s %-19s %-14s %-14s%n",
                        k,
                        salesByCountry.get(k).stream().collect(summingDouble(Sale::getTotalAmount)),
                        salesByCountry.get(k).stream().collect(summingDouble(Sale::getTax)),
                        salesByCountry.get(k).stream().collect(summingDouble(Sale::getShippingCost))
                ));

        out.fOutput(
                "----------------------------------------------------------------------------------------%n");
        out.fOutput("%n");
    }
}
