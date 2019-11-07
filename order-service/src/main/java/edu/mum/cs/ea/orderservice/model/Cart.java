package edu.mum.cs.ea.orderservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Cart {
    @Id
    private Long cartId;
    private List<Product> productList;
    private Double cartAmount;

}
