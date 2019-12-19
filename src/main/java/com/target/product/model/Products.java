package com.target.product.model;

import com.target.product.model.datasource.ProductCurrency;

public class Products {
    private Integer product_id;
    private String title;
    private ProductCurrency currency;

    public Products() {
    }

    public Products(Integer product_id, String title, ProductCurrency currency) {
        this.product_id = product_id;
        this.title = title;
        this.currency = currency;
    }
    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProductCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(ProductCurrency currency) {
        this.currency = currency;
    }
}
