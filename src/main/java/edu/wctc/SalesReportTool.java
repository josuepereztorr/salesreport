package edu.wctc;

import edu.wctc.iface.SalesInput;
import edu.wctc.iface.SalesReport;
import edu.wctc.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SalesReportTool
{
    private SalesInput input;
    private SalesReport report;
    private ShippingPolicy shippingPolicy;

    private List<Sale> allSales = new ArrayList<>();

    @Autowired
    public SalesReportTool(SalesInput input, SalesReport report,
                           ShippingPolicy shippingPolicy) {
        this.input = input;
        this.report = report;
        this.shippingPolicy = shippingPolicy;
        System.out.println("SALES REPORT TOOL V1");
    }

    private void run() {}

    private void stop() {}

    public void generateReport() {

    }
}
