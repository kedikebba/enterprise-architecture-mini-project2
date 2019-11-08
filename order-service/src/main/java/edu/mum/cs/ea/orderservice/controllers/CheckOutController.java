package edu.mum.cs.ea.orderservice.controllers;


import edu.mum.cs.ea.orderservice.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class CheckOutController {

    @GetMapping("/")
    public String getPaymentOption(){

        return "Payment is Working";
    }

}
