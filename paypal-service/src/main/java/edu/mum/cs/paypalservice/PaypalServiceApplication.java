package edu.mum.cs.paypalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaypalServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaypalServiceApplication.class, args);
    }

}
