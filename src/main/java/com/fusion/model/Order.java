package com.fusion.model;

public class Order {
    private int id;
    private String productName;
    private double price;
    private String orderDate;  
    public Order() {
    }
    
    public Order( final int Id, final String ProductName, final double Price,final String OrderDate) {
        this.id = Id;
        this.productName = ProductName;
        this.price = Price;
        this.orderDate = OrderDate;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(final int Id) {
        this.id = Id;
    }
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(final String ProductName) {
        this.productName = ProductName;
    }
        
    public double getPrice() {
        return price;
    }
    
    
    public void setPrice(final double Price) {
        this.price = Price;
    }
    public String getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(final String OrderDate) {
        this.orderDate = OrderDate;
    }
}
