package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesReport;
import edu.wctc.iface.SystemOutput;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

public class SummaryReport implements SalesReport {

    private final SystemOutput outf;

    public SummaryReport(SystemOutput out) {
        this.outf = out;
    }

    @Override
    public void generateReport(List<Sale> salesList) {
        outf.outputf(
                "----------------------------------------------------------------------------------------%n");
        outf.outputf("                                  SALES SUMMARY REPORT %n");
        outf.outputf(
                "----------------------------------------------------------------------------------------%n");
        outf.outputf("%-20S%-20S%-15S%S%n",
                "Country", "Amount", "Tax", "Shipping");

        Map<String, List<Sale>> salesByCountry =
                salesList.stream().collect(groupingBy(Sale::getCountry));

        salesByCountry.keySet().forEach(
                k -> outf.outputf("%-19s %-19s %-14s %-14s%n",
                        k,
                        salesByCountry.get(k).stream().collect(summingDouble(Sale::getTotalAmount)),
                        salesByCountry.get(k).stream().collect(summingDouble(Sale::getTax)),
                        salesByCountry.get(k).stream().collect(summingDouble(Sale::getShippingCost))
                ));

        outf.outputf(
                "----------------------------------------------------------------------------------------%n");
        outf.outputf("%n");
    }
}
