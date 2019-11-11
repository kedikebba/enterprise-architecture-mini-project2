package edu.mum.cs.ea.orderservice.controllers;

import edu.mum.cs.ea.orderservice.model.Orders;
import edu.mum.cs.ea.orderservice.model.Product;
import edu.mum.cs.ea.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }


    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    OrderService orderService;


    @PostMapping("/add")
    public Orders addToOrder(@RequestBody String address, Product product){
        //Go to stock service and pick productQty by this productID;
        Long productId = product.getProductId();

        Integer pdtQty =  restTemplate.getForObject("http://localhost:8097/stock/check/"+productId, Integer.class);
            Orders order = new Orders(product.getProductAmount());
            order.setProducts(product);
            return orderService.saveOrder(order);

    }

    @GetMapping("/checkout")
    public String checkout(){

        return restTemplate.getForObject("http://localhost:8080/payments/all", String.class);
    }
    @GetMapping("/checkout/{option}")
    public String checkoutoption(@PathVariable String option){
        return restTemplate.getForObject("http://localhost:8080/payments/"+option, String.class);
    }
    @GetMapping("/shipping")
    public String shipping(){

        return restTemplate.getForObject("http://localhost:8096/ship", String.class);
    }




}
