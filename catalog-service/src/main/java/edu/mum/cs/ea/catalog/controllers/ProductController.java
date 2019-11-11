package edu.mum.cs.ea.catalog.controllers;


import edu.mum.cs.ea.catalog.model.Product;
import edu.mum.cs.ea.catalog.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
//        return restTemplateBuilder.build();
//    }
//
//
//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ProductService productService;

    @GetMapping("/{productId}")
    public Product getProduct(@PathVariable("productId") Long productId){
        return productService.getProduct(productId);
    }

    @GetMapping("/all")
    public String getProducts(){

        return productService.getProducts();
//        return restTemplate.getForObject("http://stock-service.default.svc.cluster.local:8097/stock/all/", String.class);

    }
    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product p) {
        return productService.save(p);
    }
}
