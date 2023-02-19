package edu.wctc;

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
