package edu.wctc;

import edu.wctc.iface.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SalesReportTool
{
    private final SystemInput in;
    private final SystemOutput out;
    private final SalesInput salesInput;
    private final SalesReport salesReport;
    private final ShippingPolicy shippingPolicy;

    private final List<Sale> allSales = new ArrayList<>();

    @Autowired
    public SalesReportTool(SystemInput in, SystemOutput out,
                           SalesInput input,
                           SalesReport report,
                           ShippingPolicy shippingPolicy) {
        this.in = in;
        this.out = out;
        this.salesInput = input;
        this.salesReport = report;
        this.shippingPolicy = shippingPolicy;
    }

    public void run() {
        out.output("");
        out.output("SALES REPORT TOOL V1.0 - Program started");
        out.output("");
        System.out.println(getSales().toString());
    }

    public void generateReport() {
    }

    private List<Sale> getSales() {
        return salesInput.getSales();
    }

}
