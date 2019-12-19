package com.target.product.model.external;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDescriptionVO {

    @JsonProperty("title")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
