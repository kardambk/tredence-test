package com.bk.tredencetest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShelfDto {
    private String productId;

    private Double relevancyScore;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getRelevancyScore() {
        return relevancyScore;
    }

    public void setRelevancyScore(Double relevancyScore) {
        this.relevancyScore = relevancyScore;
    }
}
