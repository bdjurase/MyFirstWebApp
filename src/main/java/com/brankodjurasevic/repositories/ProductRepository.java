package com.brankodjurasevic.repositories;

/**
 * Created by branko.djurasevic on 3/21/2017.
 */

import com.brankodjurasevic.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}

