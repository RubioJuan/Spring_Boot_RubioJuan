package com.example.Taller_2.Service;

import com.example.Taller_2.Model.Product;
import com.example.Taller_2.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    public Product findProductById(Long id) {
        return productRepository.findById(id);
    }
}
