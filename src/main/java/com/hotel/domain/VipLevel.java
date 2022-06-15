package com.hotel.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class VipLevel implements Serializable {
    private Short level;

    private BigDecimal discount;

    private Long totalamount;

    private String remarks;

    public Short getLevel() {
        return level;
    }

    public void setLevel(Short level) {
        this.level = level;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Long getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Long totalamount) {
        this.totalamount = totalamount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public VipLevel(Short level, BigDecimal discount, Long totalamount, String remarks) {
        this.level = level;
        this.discount = discount;
        this.totalamount = totalamount;
        this.remarks = remarks;
    }

    public VipLevel() {
    }

    @Override
    public String toString() {
        return "VipLevel{" +
                "level=" + level +
                ", discount=" + discount +
                ", totalamount=" + totalamount +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}