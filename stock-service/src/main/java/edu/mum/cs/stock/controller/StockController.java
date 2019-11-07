package edu.mum.cs.stock.controller;


import edu.mum.cs.stock.model.Stock;
import edu.mum.cs.stock.service.StockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService productService;

    @GetMapping("/{productId}")
    public Stock getProduct(@PathVariable("productId") Long productId){
        return productService.getProduct(productId);
    }

    @GetMapping("/all")
    public List<Stock> getProducts(){

        return productService.getProducts();
    }
    
    @PostMapping("/addproduct")
    public Stock addProduct(@RequestBody Stock p) {
    	return productService.save(p);
    }
}
