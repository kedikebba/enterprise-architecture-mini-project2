package edu.mum.cs.ea.demo.service;

import edu.mum.cs.ea.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public List<Product> getProducts();
    public Product getProduct(Long productId);

}
