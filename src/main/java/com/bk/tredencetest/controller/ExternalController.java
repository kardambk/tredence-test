package com.bk.tredencetest.controller;

import com.bk.tredencetest.dto.ShelfDto;
import com.bk.tredencetest.dto.ShopperDto;
import com.bk.tredencetest.service.ExternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ExternalController {

    @Autowired
    private ExternalService externalService;

    @GetMapping(path = "/query/{shopperId}/{pageNumber}")
    public ResponseEntity getShelf(@PathVariable("shopperId") String shopperId,
                                   @PathVariable("pageNumber") Integer pageNumber,
                                   @RequestParam(name = "category", required = false) String category,
                                   @RequestParam(name = "brand", required = false) String brand,
                                   @RequestParam(name = "productId", required = false) String productId,
                                   @RequestParam(name = "sortBy", required = false) String sortBy,
                                   @RequestParam(name = "order", required = false) String order
                                   ) {
        Map<String, List<ShelfDto>> map = externalService.getShelf(shopperId, pageNumber, category, brand, productId, sortBy, order);
        return ResponseEntity.ok(map);
    }
}
