package com.heima.service;

import com.heima.dao.ProductDao;
import com.heima.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * xuan
 * 2018/1/8
 */
@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public Product findProduct() {
        return productDao.findProduct();
    }
}
