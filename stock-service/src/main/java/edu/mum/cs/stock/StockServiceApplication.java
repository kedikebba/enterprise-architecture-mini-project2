package edu.mum.cs.stock;

import edu.mum.cs.stock.model.Product;
import edu.mum.cs.stock.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockServiceApplication implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(StockServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productService.save(new Product("iPhone11", "Apple", "Electronics", 15, 20000.0));
        productService.save(new Product("iPhone11", "Apple", "Electronics", 15, 20000.0));
        productService.save(new Product("iPhone11", "Apple", "Electronics", 15, 20000.0));
        productService.save(new Product("iPhone11", "Apple", "Electronics", 15, 20000.0));
        productService.save(new Product("iPhone11", "Apple", "Electronics", 15, 20000.0));
        productService.save(new Product("iPhone11", "Apple", "Electronics", 15, 20000.0));
        productService.save(new Product("iPhone11", "Apple", "Electronics", 15, 20000.0));
        productService.save(new Product("iPhone11", "Apple", "Electronics", 15, 20000.0));
        productService.save(new Product("iPhone11", "Apple", "Electronics", 15, 20000.0));
        productService.save(new Product("iPhone11", "Apple", "Electronics", 15, 20000.0));
        productService.save(new Product("iPhone11", "Apple", "Electronics", 15, 20000.0));
        productService.save(new Product("iPhone11", "Apple", "Electronics", 15, 20000.0));
        productService.save(new Product("iPhone11", "Apple", "Electronics", 15, 20000.0));
        productService.save(new Product("iPhone11", "Apple", "Electronics", 15, 20000.0));




    }
}
