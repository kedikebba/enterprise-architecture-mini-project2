package edu.mum.cs.ea.orderservice.model;


import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Component
public class Payment {

    private static final String BANK = "bank";
    private static final String CREDITCARD = "creditcard";
    private static final String PAYPAL = "paypal";


}
