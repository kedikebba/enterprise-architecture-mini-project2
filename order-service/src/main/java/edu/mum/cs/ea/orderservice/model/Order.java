package edu.mum.cs.ea.orderservice.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Component
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @OneToMany
    private List<Product> orderProducts;

    private Double orderAmount;

    public Order() {
    }

    public Order(Long orderId, Double orderAmount) {
        this.orderId = orderId;
        this.orderProducts = new ArrayList<>();
        this.orderAmount = orderAmount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public List<Product> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(Product product) {
        this.orderProducts.add(product);
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderProducts=" + orderProducts +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
