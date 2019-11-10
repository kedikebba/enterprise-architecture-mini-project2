package edu.mum.cs.stock.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private String productName;
    private String productVendor;
    private String productCategory;
    private Integer producQuantity;
    private Double productAmount;

    public Product() {
    }

    public Product(String productName, String productVendor, String productCategory, Integer producQuantity, Double productAmount) {
        this.productName = productName;
        this.productVendor = productVendor;
        this.productCategory = productCategory;
        this.producQuantity = producQuantity;
        this.productAmount = productAmount;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public Integer getProducQuantity() {
        return producQuantity;
    }

    public void setProducQuantity(Integer producQuantity) {
        this.producQuantity = producQuantity;
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
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productVendor='" + productVendor + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", producQuantity=" + producQuantity +
                ", productAmount=" + productAmount +
                '}';
    }
}
