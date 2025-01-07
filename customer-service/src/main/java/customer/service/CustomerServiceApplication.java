package customer.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sony
 * @description
 * @since 2025.01.07
 **********************************************************************************************************************/
@SpringBootApplication(scanBasePackages = "com.food.ordering.system")
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
}