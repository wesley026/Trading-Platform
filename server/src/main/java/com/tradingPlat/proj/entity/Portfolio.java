package com.tradingPlat.proj.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="stock_portfolio")
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    private double assetValue;

    @OneToMany(mappedBy="portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PortfolioItem> portfolioItems;

    public Portfolio(){

    }

    public Portfolio(double assetValue){
        this.assetValue = assetValue;
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

    public double getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(double assetValue) {
        this.assetValue = assetValue;
    }

    public List<PortfolioItem> getPortfolioItems() {
        return portfolioItems;
    }

    public void setPortfolioItems(List<PortfolioItem> portfolioItems) {
        this.portfolioItems = portfolioItems;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "id=" + id +
                ", assetValue=" + assetValue +
                '}';
    }
}
