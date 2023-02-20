package edu.wctc.impl;

import edu.wctc.iface.SystemOutput;

public class ConsoleOutput implements SystemOutput {
    @Override
    public void output(String text) {
        System.out.println(text);
    }

    @Override
    public void outputf(String text, Object... args) {
        System.out.printf(text, args);
    }
}
