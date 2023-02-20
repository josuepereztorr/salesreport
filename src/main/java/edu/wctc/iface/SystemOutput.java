package edu.wctc.iface;

public interface SystemOutput {
    void output(String text);
    void outputf(String text, Object ... args);
}
