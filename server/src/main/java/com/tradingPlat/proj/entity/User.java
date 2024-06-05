package com.tradingPlat.proj.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="user_details")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;


    // the persistance will propagate / cascade all EntityManager operations(Persist,Remove, Refresh, Merge and Detach)
    // when user is removed, the remove operation is cascaded to the mapped potfolio object
    @OneToOne(mappedBy = "user", cascade= CascadeType.ALL, orphanRemoval = true)
    private Portfolio portfolio;

    @OneToMany(mappedBy="user", cascade=CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transactions;

    @OneToOne(mappedBy="user", cascade =CascadeType.ALL, orphanRemoval = true)
    private TradingAccount tradingAccount;


    public User(){

    }

    // no need to include TradingAccount, Transaction and Portfolio properties since these represent one to one
    // relationships and they are managed by JPA and the framework will take care of creating and maintaining
    // these entities
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public TradingAccount getTradingAccount() {
        return tradingAccount;
    }

    public void setTradingAccount(TradingAccount tradingAccount) {
        this.tradingAccount = tradingAccount;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
