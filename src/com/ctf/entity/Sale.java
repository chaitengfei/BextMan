package com.ctf.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Sale {

 private int  id;
 private float  price;
 private int  quantity;
 private float  totalPrice;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
 private Date saleDate;
 private int  userId;
 private int  productId;


    private String userName1;//链表查询用户名
    private String proName;//连表查询商品名

    public String getUserName1() {
        return userName1;
    }

    public void setUserName1(String userName1) {
        this.userName1 = userName1;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }



    public Sale() {
    }

    public Sale(int id, float price, int quantity, float totalPrice, Date saleDate, int userId, int productId) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.saleDate = saleDate;
        this.userId = userId;
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", price=" + price +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", saleDate=" + saleDate +
                ", userId=" + userId +
                ", productId=" + productId +
                '}';
    }
}
