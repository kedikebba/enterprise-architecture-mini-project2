package edu.mum.cs.stock.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.stock.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
}
