package edu.wctc;

import edu.wctc.iface.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component()
public class SalesReportTool
{
    private SalesReportInput in;
    private SalesReportOutput out;
    private SalesInput salesInput;
    private SalesReport salesReport;
    private ShippingPolicy shippingPolicy;

    private List<Sale> allSales = new ArrayList<>();

    @Autowired
    public SalesReportTool(SalesReportInput in, SalesReportOutput out,
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
        out.output("SALES REPORT TOOL V1.0 - Program started");
        out.output("");
        out.output(getSales().toString());
    }

    public void generateReport() {
    }

    private List<Sale> getSales() {
        return salesInput.getSales();
    }

}
