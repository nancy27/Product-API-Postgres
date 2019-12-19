package com.target.product.productentity;

import javax.persistence.*;

@Entity
@Table(name="Product")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
    @Column(name = "productId")
    private Integer productId;
    @Column(name="value")
    private Float value;
    @Column(name = "currency_code")
    private String currencyCode;

    public ProductsEntity() {
    }

    public ProductsEntity(Integer productId, Float value, String currencyCode) {
        this.productId = productId;
        this.value = value;
        this.currencyCode = currencyCode;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
