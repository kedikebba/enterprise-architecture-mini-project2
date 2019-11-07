package edu.mum.cs.ea.orderservice.model;


import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;


@Component
public class Product {

    private String productName;
    private String productVendor;
    private String productCategory;
    private Double productAmount;

    public Product() {
    }

    public Product(String productName, String productVendor, String productCategory, Double productAmount) {

        this.productName = productName;
        this.productVendor = productVendor;
        this.productCategory = productCategory;
        this.productAmount = productAmount;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Double getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Double productAmount) {
        this.productAmount = productAmount;
    }

    @Override
    public String toString() {
        return "Product{" +
                ", productName='" + productName + '\'' +
                ", productVendor='" + productVendor + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productAmount=" + productAmount +
                '}';
    }
}
