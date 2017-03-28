package com.brankodjurasevic.services;

import com.brankodjurasevic.domain.Product;

/**
 * @author Branko Djurasevic
 */
public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);
}
