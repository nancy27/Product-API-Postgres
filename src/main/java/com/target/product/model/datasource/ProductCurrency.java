package com.target.product.model.datasource;

public class ProductCurrency {
    private Float value;
    private String currencyCode;

    public ProductCurrency() {
    }

    public ProductCurrency(Float value, String currencyCode) {
        this.value = value;
        this.currencyCode = currencyCode;
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
