package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesInput;
import edu.wctc.iface.SalesReportInput;

import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements SalesReportInput {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
