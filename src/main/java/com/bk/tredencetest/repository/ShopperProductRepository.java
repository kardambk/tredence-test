package com.bk.tredencetest.repository;

import com.bk.tredencetest.entity.ShopperProducts;
import com.bk.tredencetest.repository.custom.CustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopperProductRepository extends JpaRepository<ShopperProducts, Integer>, CustomRepository {
}
