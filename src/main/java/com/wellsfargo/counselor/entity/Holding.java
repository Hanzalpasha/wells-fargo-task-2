package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "holdings")
public class Holding {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "quantity", nullable = false)
    private BigDecimal quantity;

    @Column(name = "average_buy_price")
    private BigDecimal averageBuyPrice;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "security_id", nullable = false)
    private Security security;

    public Holding() {}

    public Holding(BigDecimal quantity, BigDecimal averageBuyPrice, Portfolio portfolio, Security security) {
        this.quantity = quantity;
        this.averageBuyPrice = averageBuyPrice;
        this.portfolio = portfolio;
        this.security = security;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAverageBuyPrice() {
        return averageBuyPrice;
    }

    public void setAverageBuyPrice(BigDecimal averageBuyPrice) {
        this.averageBuyPrice = averageBuyPrice;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }
}