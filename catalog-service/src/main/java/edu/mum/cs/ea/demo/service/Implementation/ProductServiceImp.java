package edu.mum.cs.ea.demo.service.Implementation;

import edu.mum.cs.ea.demo.model.Product;
import edu.mum.cs.ea.demo.repository.ProductRepository;
import edu.mum.cs.ea.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long productId) {
        return productRepository.findById(productId).get();
    }
}
