package com.example.Taller_1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<Product> getAllProducts() {
        // Crear una lista de productos
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Product A", 10.99));
        products.add(new Product(2, "Product B", 12.99));
        products.add(new Product(3, "Product C", 8.99));

        // Retornar la lista de productos
        return products;
    }
}