package com.ctf.entity;
import java.util.List;
import com.ctf.entity.Product;

public class Product {
  private int  id;
  private String  productName;
  private String  quantity;

    public Product() {
    }

    public Product(int id, String productName, String quantity) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }


}
