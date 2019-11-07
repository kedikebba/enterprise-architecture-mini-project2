package edu.mum.cs.ea.orderservice.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order/cart")
public class CartController {


    @PostMapping("/add/{productId}")
    public void addToCart(@PathVariable("productId") Long productId){
        
    }
    @GetMapping("/all/{userId}")
    public void getCartProducts(@PathVariable("userId") Long userId){

    }



}
