package com.bitgo.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(schema = "notification")
public class Notification{
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name ="price")
    private Double price;

    @Column(name ="percentage_change")
            private Double pctChange;

    @Column(name ="trading_volume")
    private Double TradingVolume;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPctChange() {
        return pctChange;
    }

    public void setPctChange(Double pctChange) {
        this.pctChange = pctChange;
    }

    public Double getTradingVolume() {
        return TradingVolume;
    }

    public void setTradingVolume(Double tradingVolume) {
        TradingVolume = tradingVolume;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", price=" + price +
                ", pctChange=" + pctChange +
                ", TradingVolume=" + TradingVolume +
                '}';
    }
}
