package edu.wctc;

import edu.wctc.iface.SalesReportOutput;
import edu.wctc.impl.ConsoleOutput;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        // start the reporting software
        context.getBean(
                SalesReportTool.class).run();
    }
}
