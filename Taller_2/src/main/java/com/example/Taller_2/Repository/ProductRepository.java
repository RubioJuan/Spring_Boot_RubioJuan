package com.example.Taller_2.Repository;

import com.example.Taller_2.Model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public List<Product> findAll() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}