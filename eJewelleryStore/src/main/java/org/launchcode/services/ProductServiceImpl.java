package org.launchcode.services;

import org.launchcode.domain.Owner;
import org.launchcode.domain.Product;
import org.launchcode.domain.ProductCategory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Shoba on 5/11/2017.
 */
@Service
public class ProductServiceImpl implements ProductService{

    private Map<Integer, Product> productMap;

    public ProductServiceImpl() {
        loadProducts();
    }

    @Override
    public Product getProduct(Integer id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> listProducts() {
        return new ArrayList<>(productMap.values());
    }

    private void loadProducts() {

        Owner jt = new Owner();
        jt.setFirstName("Shoba");
        jt.setLastName("Munirathnam");
        jt.setId(1);

        ProductCategory necklaceSet1Cat = new ProductCategory();
        necklaceSet1Cat.setId(1);
        necklaceSet1Cat.setCategory("Necklace Set 1");

        ProductCategory necklaceSet2Cat = new ProductCategory();
        necklaceSet2Cat.setId(2);
        necklaceSet2Cat.setCategory("Necklace Set 2");

        ProductCategory necklaceSet3Cat = new ProductCategory();
        necklaceSet3Cat.setId(3);
        necklaceSet3Cat.setCategory("Necklace Set 3");

        ProductCategory necklaceSet4Cat = new ProductCategory();
        necklaceSet4Cat.setId(4);
        necklaceSet4Cat.setCategory("Necklace Set 4");

        ProductCategory necklaceSet5Cat = new ProductCategory();
        necklaceSet5Cat.setId(5);
        necklaceSet5Cat.setCategory("Necklace Set 5");

        ProductCategory necklaceSet6Cat = new ProductCategory();
        necklaceSet6Cat.setId(6);
        necklaceSet6Cat.setCategory("Necklace Set 6");

        productMap = new HashMap<>();

        Product necklaceSet1 = new Product();
        necklaceSet1.setId(1);
        necklaceSet1.setProductName("Beautiful Blue Green Silk Thread Necklace Set");
        necklaceSet1.setProductSubtitle("Necklace Set");
        necklaceSet1.setOwner(jt);
        necklaceSet1.setProductDescription(" Necklace - Height : 26 cms. \n" +
                "\n" +
                "1 Pair of earrings - Height : 4.5 cms, Width : 4 cm. \n" +
                "\n" +
                "The necklace is made up of silk thread beads.");

        necklaceSet1.setPrice(new BigDecimal("10"));
        necklaceSet1.setImageUrl("Necklaceset1.png");
        necklaceSet1.getProductCategories().add(necklaceSet1Cat);
        productMap.put(1, necklaceSet1);

        Product necklaceSet2 = new Product();
        necklaceSet2.setId(2);
        necklaceSet2.setProductName("Beautiful Blue Green Silk Thread Necklace Set");
        necklaceSet2.setProductSubtitle("Necklace Set");
        necklaceSet2.setOwner(jt);
        necklaceSet2.setProductDescription(" Necklace - Height : 26 cms. \n" +
                "\n" +
                "1 Pair of earrings - Height : 4.5 cms, Width : 4 cm. \n" +
                "\n" +
                "The necklace is made up of silk thread beads.");

        necklaceSet2.setPrice(new BigDecimal("10"));
        necklaceSet2.setImageUrl("Necklaceset2.png");
        necklaceSet2.getProductCategories().add(necklaceSet2Cat);
        productMap.put(2, necklaceSet2);

        Product necklaceSet3 = new Product();
        necklaceSet3.setId(3);
        necklaceSet3.setProductName("Beautiful Black Silk Thread Necklace Set");
        necklaceSet3.setProductSubtitle("Necklace Set");
        necklaceSet3.setOwner(jt);
        necklaceSet3.setProductDescription(" Necklace - Height : 26 cms. \n" +
                "\n" +
                "1 Pair of earrings - Height : 4.5 cms, Width : 4 cm. \n" +
                "\n" +
                "The necklace is made up of silk thread beads.");

        necklaceSet3.setPrice(new BigDecimal("10"));
        necklaceSet3.setImageUrl("Necklaceset3.png");
        necklaceSet3.getProductCategories().add(necklaceSet3Cat);
        productMap.put(3, necklaceSet3);

        Product necklaceSet4 = new Product();
        necklaceSet4.setId(4);
        necklaceSet4.setProductName("Beautiful Pink Silk Thread Necklace Set");
        necklaceSet4.setProductSubtitle("Necklace Set");
        necklaceSet4.setOwner(jt);
        necklaceSet4.setProductDescription(" Necklace - Height : 26 cms. \n" +
                "\n" +
                "1 Pair of earrings - Height : 4.5 cms, Width : 4 cm. \n" +
                "\n" +
                "The necklace is made up of silk thread beads.");

        necklaceSet4.setPrice(new BigDecimal("10"));
        necklaceSet4.setImageUrl("Necklaceset4.png");
        necklaceSet4.getProductCategories().add(necklaceSet4Cat);
        productMap.put(4, necklaceSet4);

        Product necklaceSet5 = new Product();
        necklaceSet5.setId(5);
        necklaceSet5.setProductName("Beautiful White Gold Silk Thread Necklace Set");
        necklaceSet5.setProductSubtitle("Necklace Set");
        necklaceSet5.setOwner(jt);
        necklaceSet5.setProductDescription(" Necklace - Height : 26 cms. \n" +
                "\n" +
                "1 Pair of earrings - Height : 4.5 cms, Width : 4 cm. \n" +
                "\n" +
                "The necklace is made up of silk thread beads.");

        necklaceSet5.setPrice(new BigDecimal("10"));
        necklaceSet5.setImageUrl("Necklaceset5.png");
        necklaceSet5.getProductCategories().add(necklaceSet5Cat);
        productMap.put(5, necklaceSet5);

        Product necklaceSet6 = new Product();
        necklaceSet6.setId(6);
        necklaceSet6.setProductName("Beautiful Peach Silk Thread Necklace Set");
        necklaceSet6.setProductSubtitle("Necklace Set");
        necklaceSet6.setOwner(jt);
        necklaceSet6.setProductDescription(" Necklace - Height : 26 cms. \n" +
                "\n" +
                "1 Pair of earrings - Height : 4.5 cms, Width : 4 cm. \n" +
                "\n" +
                "The necklace is made up of silk thread beads.");

        necklaceSet6.setPrice(new BigDecimal("10"));
        necklaceSet6.setImageUrl("Necklaceset6.png");
        necklaceSet6.getProductCategories().add(necklaceSet6Cat);
        productMap.put(6, necklaceSet6);


    }
}

