package org.launchcode.services;

import org.launchcode.domain.Product;

import java.util.List;

/**
 * Created by Shoba on 5/11/2017.
 */
public interface ProductService {

    Product getProduct(Integer id);
    List<Product> listProducts();
}
