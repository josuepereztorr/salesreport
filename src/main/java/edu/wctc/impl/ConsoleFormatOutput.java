package edu.wctc.impl;

import edu.wctc.iface.SystemFormattedOutput;

public class ConsoleFormatOutput implements SystemFormattedOutput {
    @Override
    public void fOutput(String text) {
        System.out.printf(text);
    }

    @Override
    public void fOutputArgs(String format, Object ... args) {
        System.out.printf(format, args);
    }
}
