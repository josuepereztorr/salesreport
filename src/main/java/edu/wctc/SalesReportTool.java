package edu.wctc;

import edu.wctc.iface.SalesInput;
import edu.wctc.iface.SalesReport;
import edu.wctc.iface.ShippingPolicy;
import edu.wctc.iface.SystemOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesReportTool
{
    private final SystemOutput out;
    private final SalesInput salesInput;
    private final SalesReport salesReport;
    private final ShippingPolicy shippingPolicy;

    @Autowired
    public SalesReportTool(SystemOutput out,
                           SalesInput input,
                           SalesReport report,
                           ShippingPolicy shippingPolicy) {
        this.out = out;
        this.salesInput = input;
        this.salesReport = report;
        this.shippingPolicy = shippingPolicy;
    }

    public void run() {
        out.output("");
        out.output("SALES REPORT TOOL V1.0 - Program started");
        out.output("");
        generateReport();
    }

    public void generateReport() {
        List<Sale> allSales = salesInput.getSales();
        for(Sale aSale : allSales)
            shippingPolicy.applyShipping(aSale);
        salesReport.generateReport(allSales);
    }

}
