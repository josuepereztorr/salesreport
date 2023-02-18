package edu.wctc;

import edu.wctc.iface.*;
import edu.wctc.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc")
public class AppConfig {
    @Bean
    public SalesReportInput input() {
        return new ConsoleInput();
    }

    @Bean
    public SalesReportOutput output() {
        return new ConsoleOutput();
    }
    @Bean
    public SalesInput salesInput() {
        return new FileInput();
    }

    @Bean
    public SalesReport salesReport() {
        return new DetailReport();
    }

    @Bean
    public ShippingPolicy shippingPolicy() {
        return new FreeShipping();
    }
}
