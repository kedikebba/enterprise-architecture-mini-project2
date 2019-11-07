package edu.mum.cs.stock.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {

    @Id
    private Long productId;
    private String productName;
    private String vendor;
    private String category;
    private float quantity;

    public Stock() {
    }

    public Stock(Long productId, String productName, String vendor, String category, float quantity) {
        this.productId = productId;
        this.productName = productName;
        this.vendor = vendor;
        this.category = category;
        this.quantity=quantity;
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

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
	public String toString() {
		return "Stock [productId=" + productId + ","
				+ " productName=" + productName + ","
				+ " vendor=" + vendor + ", category="
				+ category + ","
				+ " quantity=" + quantity + "]";
	}
}
