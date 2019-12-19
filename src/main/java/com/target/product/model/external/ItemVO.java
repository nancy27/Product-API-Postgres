package com.target.product.model.external;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemVO {

    @JsonProperty("product_description")
    private ProductDescriptionVO productDescriptionVO;

    public ProductDescriptionVO getProductDescriptionVO() {
        return productDescriptionVO;
    }

    public void setProductDescriptionVO(ProductDescriptionVO productDescriptionVO) {
        this.productDescriptionVO = productDescriptionVO;
    }
}
