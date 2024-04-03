package com.bk.tredencetest.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ShopperDto {

    private String shopperId;

    private List<ShelfDto> shelf;

    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public List<ShelfDto> getShelf() {
        return shelf;
    }

    public void setShelf(List<ShelfDto> shelf) {
        this.shelf = shelf;
    }
}
