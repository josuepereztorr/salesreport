package edu.wctc.impl;

import edu.wctc.iface.SystemInput;

import java.util.Scanner;

public class ConsoleInput implements SystemInput {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
