package com.bk.tredencetest.service;

import com.bk.tredencetest.dto.ShelfDto;
import com.bk.tredencetest.dto.ShopperDto;
import com.bk.tredencetest.entity.ShopperProducts;
import com.bk.tredencetest.mapper.MappingHelper;
import com.bk.tredencetest.repository.ProductRepository;
import com.bk.tredencetest.repository.ShopperProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ExternalService {

    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private ShopperProductRepository shopperProductRepo;

    @Autowired
    private MappingHelper mapper;


    public Map<String, List<ShelfDto>> getShelf(String shopperId, Integer pageNumber, String category, String brand, String productId, String sortBy, String order) {

        List<ShopperProducts> prods = shopperProductRepo.getShelf(shopperId, pageNumber, category, brand, productId, sortBy, order);
        Integer count = 0;
        Map<String, List<ShelfDto>> map = new HashMap<>();
        List<ShelfDto> shelfList = null;
        ShelfDto shelf = null;
        for (ShopperProducts product : prods) {
            System.out.println("Count >>>> " + count++);
            shelf = new ShelfDto();
            shelf.setProductId(product.getProduct().getProductId());
            shelf.setRelevancyScore(product.getRelevancyScore());

            if (map.get(product.getShopperId()) != null) {
                map.get(product.getShopperId()).add(shelf);
            } else {
                shelfList = new ArrayList<>();
                shelfList.add(shelf);
                map.put(product.getShopperId(), shelfList);
            }
        }

        return map;
    }
}
