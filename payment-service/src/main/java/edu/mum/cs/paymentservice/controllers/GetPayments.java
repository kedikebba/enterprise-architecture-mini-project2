package edu.mum.cs.paymentservice.controllers;


import edu.mum.cs.paymentservice.model.Payment;
import edu.mum.cs.paymentservice.respository.PaymentRepository;
import edu.mum.cs.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class GetPayments {

    private String bankResponse;
    private String creditResponse;
    private String paypalResponse;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }

    @GetMapping("/all")
    public List<Payment> getPaymentOptions(){

        return paymentService.getPaymentOptions();
    }

    @GetMapping("/creditcard")
    public String getCreditCard(){
        return restTemplate.getForObject("http://localhost:8093/creditcard", String.class);
    }

    @GetMapping("/bank")
    public String getBank(){
        return restTemplate.getForObject("http://localhost:8094/bank", String.class);
    }

    @GetMapping("/paypal")
    public String getPaypal(){
            return restTemplate.getForObject("http://localhost:8092/paypal", String.class);
    }



}
