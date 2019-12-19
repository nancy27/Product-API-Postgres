package com.target.product.model.external;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {

    @JsonProperty("product")
   private ProductVO productVO;

    public ProductVO getProductVO() {
        return productVO;
    }

    public void setProductVO(ProductVO productVO) {
        this.productVO = productVO;
    }
}
