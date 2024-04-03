package com.bk.tredencetest.service;

import com.bk.tredencetest.dto.ProductDto;
import com.bk.tredencetest.dto.ShelfDto;
import com.bk.tredencetest.dto.ShopperDto;
import com.bk.tredencetest.entity.Product;
import com.bk.tredencetest.entity.ShopperProducts;
import com.bk.tredencetest.mapper.MappingHelper;
import com.bk.tredencetest.repository.ProductRepository;
import com.bk.tredencetest.repository.ShopperProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class InternalService {

    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private ShopperProductRepository shopperProductRepo;

    @Autowired
    private MappingHelper mapper;

    public void createProductList(List<ProductDto> productDtoList) {
        List<Product> products = mapper.productDtoListToProductList(productDtoList);
        productRepo.saveAll(products);
    }

    public void createShopperProducts(List<ShopperDto> shopperDtoList) {

        List<ShopperProducts> shopperProductsList = new ArrayList<>();
        ShopperProducts shopperProduct = null;
        for (ShopperDto shopper : shopperDtoList) {
            for (ShelfDto shelf : shopper.getShelf()) {
                shopperProduct = new ShopperProducts();
                shopperProduct.setShopperId(shopper.getShopperId());
                shopperProduct.setProduct(productRepo.findById(shelf.getProductId()).get());
                shopperProduct.setRelevancyScore(shelf.getRelevancyScore());
                try {
                    shopperProductRepo.save(shopperProduct);
                } catch (Exception e) {
                    System.out.println(">>>>>>>>" + shopperProduct.getProduct().getProductId());
                }

//                shopperProductsList.add(shopperProduct);
            }
        }
//        shopperProductRepo.saveAll(shopperProductsList);
    }
}
