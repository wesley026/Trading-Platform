package com.tradingPlat.proj.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="stock_watchlist")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="stock_id")
    private Long id;

    @Column(name="ticker_code")
    private String ticker;
    private String stock;
    private double currentPrice;
    private double priceChange;
    private double high;
    private double low;

    private double open;

    private double prevClose;

    private Double divYieldTtm;

    private double mktCap;

    @Column(name="52WkHigh")
    private double fiftyTwoHigh;

    @Column(name="52WkLow")
    private double fiftyTwoLow;
    private double volume;

    @OneToMany(mappedBy= "stock", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transactions;

    // default constructor required by JPA
    public Stock(){

    }

    public Stock(String ticker, String stock, double currentPrice, double priceChange, double high, double low, double open, double prevClose, Double divYieldTtm, double mktCap, double fiftyTwoHigh, double fiftyTwoLow, double volume) {
        this.ticker = ticker;
        this.stock = stock;
        this.currentPrice = currentPrice;
        this.priceChange = priceChange;
        this.high = high;
        this.low = low;
        this.open = open;
        this.prevClose = prevClose;
        this.divYieldTtm = divYieldTtm;
        this.mktCap = mktCap;
        this.fiftyTwoHigh = fiftyTwoHigh;
        this.fiftyTwoLow = fiftyTwoLow;
        this.volume = volume;
    }

    // defining getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(double priceChange) {
        this.priceChange = priceChange;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getPrevClose() {
        return prevClose;
    }

    public void setPrevClose(double prevClose) {
        this.prevClose = prevClose;
    }

    public Double getDivYieldTtm() {
        return divYieldTtm;
    }

    public void setDivYieldTtm(Double divYieldTtm) {
        this.divYieldTtm = divYieldTtm;
    }

    public double getMktCap() {
        return mktCap;
    }

    public void setMktCap(double mktCap) {
        this.mktCap = mktCap;
    }

    public double getFiftyTwoHigh() {
        return fiftyTwoHigh;
    }

    public void setFiftyTwoHigh(double fiftyTwoHigh) {
        this.fiftyTwoHigh = fiftyTwoHigh;
    }

    public double getFiftyTwoLow() {
        return fiftyTwoLow;
    }

    public void setFiftyTwoLow(double fiftyTwoLow) {
        this.fiftyTwoLow = fiftyTwoLow;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    // define toString

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", ticker='" + ticker + '\'' +
                ", stock='" + stock + '\'' +
                ", currentPrice=" + currentPrice +
                ", priceChange=" + priceChange +
                ", high=" + high +
                ", low=" + low +
                ", open=" + open +
                ", prevClose=" + prevClose +
                ", divYieldTtm=" + divYieldTtm +
                ", mktCap=" + mktCap +
                ", fiftyTwoHigh=" + fiftyTwoHigh +
                ", fiftyTwoLow=" + fiftyTwoLow +
                ", volume=" + volume +
                '}';
    }
}
