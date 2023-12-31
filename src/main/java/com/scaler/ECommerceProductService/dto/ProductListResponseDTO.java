package com.scaler.ECommerceProductService.dto;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ProductListResponseDTO {
    private List<ProductResponseDTO> productList;

    public ProductListResponseDTO(){
        this.productList = new ArrayList<>();
    }
}
