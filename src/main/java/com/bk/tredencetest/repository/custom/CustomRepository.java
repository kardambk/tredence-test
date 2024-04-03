package com.bk.tredencetest.repository.custom;

import com.bk.tredencetest.entity.ShopperProducts;

import java.util.List;

public interface CustomRepository {
    List<ShopperProducts> getShelf(String shopperId, Integer pageNumber, String category, String brand, String productId, String sortBy, String order);
}
