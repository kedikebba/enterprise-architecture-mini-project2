package edu.mum.cs.stock.service.implementation;

import edu.mum.cs.stock.model.Stock;
import edu.mum.cs.stock.repository.StockRepository;
import edu.mum.cs.stock.service.StockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImp implements StockService {

    @Autowired
    private StockRepository productRepository;
    @Override
    public List<Stock> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Stock getProduct(Long productId) {
        return productRepository.findById(productId).get();
    }

	@Override
	public Stock save(Stock product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}
}
