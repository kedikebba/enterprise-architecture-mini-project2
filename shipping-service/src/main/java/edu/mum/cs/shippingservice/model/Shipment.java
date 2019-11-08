package edu.mum.cs.shippingservice.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long shipmentId;
    private User user;
    private Order order;
    private Address address;

    public Shipment() {
    }

    public Shipment(Long shipmentId, User user, Order order, Address address) {
        this.shipmentId = shipmentId;
        this.user = user;
        this.order = order;
        this.address = address;
    }

    public Long getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
