package edu.wctc;

import edu.wctc.iface.SalesInput;
import edu.wctc.iface.SalesReport;
import edu.wctc.iface.ShippingPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc")
public class AppConfig {
    @Bean
    public SalesInput salesInput() {
        return null;
    }

    @Bean
    public SalesReport salesReport() {
        return null;
    }

    @Bean
    public ShippingPolicy shippingPolicy() {
        return null;
    }
}
