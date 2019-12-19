package com.target.product.model.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductVO {
    @JsonProperty("item")
    private ItemVO itemVO;

    public ItemVO getItemVO() {
        return itemVO;
    }

    public void setItemVO(ItemVO itemVO) {
        this.itemVO = itemVO;
    }


}
