package edu.wctc;

import edu.wctc.iface.SalesInput;
import edu.wctc.impl.FileInput;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        // start the reporting software
        SalesInput salesInput = (SalesInput) context.getBean(SalesInput.class);
        salesInput.getSales();
    }
}
