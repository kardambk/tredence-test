package com.bk.tredencetest.mapper;


import com.bk.tredencetest.dto.ProductDto;
import com.bk.tredencetest.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MappingHelper {

    Product productDtoToProduct(ProductDto product);
    List<Product> productDtoListToProductList(List<ProductDto> productDtoList);
}
