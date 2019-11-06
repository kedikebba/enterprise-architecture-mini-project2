package edu.mum.cs.ea.demo.model;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    private Long addressId;
    private String country;
    private String state;
    private String city;
    private String street;
    @OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL,mappedBy = "address")
    private User user;

    public Address() {
    }

    public Address(Long addressId, String country, String state, String city, String street) {
        this.addressId = addressId;
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;

    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", user=" + user +
                '}';
    }
}
