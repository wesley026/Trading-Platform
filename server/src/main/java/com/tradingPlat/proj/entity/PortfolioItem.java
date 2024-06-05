package com.tradingPlat.proj.entity;

import jakarta.persistence.*;

@Entity
@Table(name="owned_stock")
public class PortfolioItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // relationship annotation shows the relationship between class Name(PortfolioItem) and declared private class variable
    // : portfolio

    @ManyToOne
    @JoinColumn(name="portfolio_id", nullable=false)
    private Portfolio portfolio;

    private int quantity;
    private double mktValue;

    private double currPrice;
    private double cost;

    private double tdyPl;

    public PortfolioItem(){

    }

    public PortfolioItem(int quantity, double mktValue, double currPrice, double cost, double tdyPl) {
        this.quantity = quantity;
        this.mktValue = mktValue;
        this.currPrice = currPrice;
        this.cost = cost;
        this.tdyPl = tdyPl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getMktValue() {
        return mktValue;
    }

    public void setMktValue(double mktValue) {
        this.mktValue = mktValue;
    }

    public double getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(double currPrice) {
        this.currPrice = currPrice;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTdyPl() {
        return tdyPl;
    }

    public void setTdyPl(double tdyPl) {
        this.tdyPl = tdyPl;
    }

    @Override
    public String toString() {
        return "PortfolioItem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", mktValue=" + mktValue +
                ", currPrice=" + currPrice +
                ", cost=" + cost +
                ", tdyPl=" + tdyPl +
                '}';
    }
}
