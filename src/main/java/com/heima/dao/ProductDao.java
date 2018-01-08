package com.heima.dao;

import com.heima.domain.Product;

import java.math.BigDecimal;

/**
 * xuan
 * 2018/1/8
 */
public class ProductDao {
    public Product findProduct() {
        Product product = new Product();
        product.setName("手机");
        product.setPrice(new BigDecimal("2999"));
        return product;
    }
}
