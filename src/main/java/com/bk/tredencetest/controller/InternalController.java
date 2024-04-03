package com.bk.tredencetest.controller;

import com.bk.tredencetest.dto.ProductDto;
import com.bk.tredencetest.dto.ShopperDto;
import com.bk.tredencetest.service.InternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InternalController {

    @Autowired
    private InternalService internalService;

    @PostMapping(path = "/product", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createProductList(@RequestBody List<ProductDto> productList) {
        internalService.createProductList(productList);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping(path = "/shopper-product", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createShopperProductList(@RequestBody List<ShopperDto> shopperDtoList) {
        internalService.createShopperProducts(shopperDtoList);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
