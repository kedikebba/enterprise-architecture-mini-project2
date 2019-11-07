package edu.mum.cs.ea.orderservice.controllers;

import edu.mum.cs.ea.orderservice.model.Order;
import edu.mum.cs.ea.orderservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private Product product;
    @Autowired
    private Order order;

    @PostMapping("/add/{productId}")
    public Order addToOrder(@PathVariable("productId") Long productId){
        //Go to stock service and pick product by this productID;
        //Add this product to Order
        order.setOrderProducts(product);
        order.setOrderAmount(product.getProductAmount());
        return order;

    }
    @GetMapping("/all/{userId}")
    public List<Product> getOrderProducts(@PathVariable("userId") Long userId){
        return order.getOrderProducts();
    }



}
