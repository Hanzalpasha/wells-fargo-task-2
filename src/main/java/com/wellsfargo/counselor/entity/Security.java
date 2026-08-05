package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "securities")
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ticker_symbol", nullable = false, unique = true)
    private String tickerSymbol;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "asset_type")
    private String assetType;

    @Column(name = "current_price")
    private BigDecimal currentPrice;

    public Security() {}

    public Security(String tickerSymbol, String name, String assetType, BigDecimal currentPrice) {
        this.tickerSymbol = tickerSymbol;
        this.name = name;
        this.assetType = assetType;
        this.currentPrice = currentPrice;
    }

    public Long getId() {
        return id;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }
}