package edu.mum.cs.ea.orderservice.model;


import javax.persistence.Entity;
import java.util.List;

@Entity
public class Order {

    private Long orderId;
    private List<Product> orderProducts;
    private Double orderAmount;
}
