package com.tradingPlat.proj.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name= "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name="stock_ticker",nullable = false)
    private Stock stock;
    private TransactionType type;
    private int quantity;
    private double price;
    private LocalDateTime timestamp;

    // Transaction status

    public Transaction(){

    }

    public Transaction(TransactionType type, int quantity, double price, LocalDateTime timestamp) {
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", type=" + type +
                ", quantity=" + quantity +
                ", price=" + price +
                ", timestamp=" + timestamp +
                '}';
    }
}
