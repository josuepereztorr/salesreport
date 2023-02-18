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
    public SystemInput input() {
        return new ConsoleInput();
    }

    @Bean
    public SystemOutput output() {
        return new ConsoleOutput();
    }
    @Bean
    public SalesInput salesInput() {
        return new FileReader();
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
