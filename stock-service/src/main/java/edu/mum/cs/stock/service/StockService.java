package edu.mum.cs.stock.service;

import org.springframework.stereotype.Service;

import edu.mum.cs.stock.model.Stock;

import java.util.List;

@Service
public interface StockService {

    public List<Stock> getProducts();
    public Stock getProduct(Long productId);
    public Stock save(Stock product);

}
