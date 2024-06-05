package com.tradingPlat.proj.entity;


import jakarta.persistence.*;

@Entity
@Table(name="trading_account")
public class TradingAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double cashBalance;
    private double marginBalance;
    private double totalEquity;
    private double leverageRatio;
    private double portfolioValue;
    private double maintenanceMargin;

    @OneToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    public TradingAccount(){

    }

    public TradingAccount(double cashBalance, double marginBalance, double totalEquity, double leverageRatio, double portfolioValue, double maintenanceMargin) {
        this.cashBalance = cashBalance;
        this.marginBalance = marginBalance;
        this.totalEquity = totalEquity;
        this.leverageRatio = leverageRatio;
        this.portfolioValue = portfolioValue;
        this.maintenanceMargin = maintenanceMargin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(double cashBalance) {
        this.cashBalance = cashBalance;
    }

    public double getMarginBalance() {
        return marginBalance;
    }

    public void setMarginBalance(double marginBalance) {
        this.marginBalance = marginBalance;
    }

    public double getTotalEquity() {
        return totalEquity;
    }

    public void setTotalEquity(double totalEquity) {
        this.totalEquity = totalEquity;
    }

    public double getLeverageRatio() {
        return leverageRatio;
    }

    public void setLeverageRatio(double leverageRatio) {
        this.leverageRatio = leverageRatio;
    }

    public double getPortfolioValue() {
        return portfolioValue;
    }

    public void setPortfolioValue(double portfolioValue) {
        this.portfolioValue = portfolioValue;
    }

    public double getMaintenanceMargin() {
        return maintenanceMargin;
    }

    public void setMaintenanceMargin(double maintenanceMargin) {
        this.maintenanceMargin = maintenanceMargin;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "TradingAccount{" +
                "id=" + id +
                ", cashBalance=" + cashBalance +
                ", marginBalance=" + marginBalance +
                ", totalEquity=" + totalEquity +
                ", leverageRatio=" + leverageRatio +
                ", portfolioValue=" + portfolioValue +
                ", maintenanceMargin=" + maintenanceMargin +
                '}';
    }
}
