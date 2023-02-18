package edu.wctc.impl;

import edu.wctc.iface.SalesReportOutput;

public class ConsoleOutput implements SalesReportOutput {
    @Override
    public void output(String text) {
        System.out.println(text);
    }
}
