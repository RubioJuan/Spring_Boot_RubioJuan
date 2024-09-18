package com.example.Taller_2;

import com.example.Taller_2.Controller.ProductController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Taller2Application {

    private final ProductController productController;

    public Taller2Application(ProductController productController) {
        this.productController = productController;
    }

    public static void main(String[] args) {
        SpringApplication.run(Taller2Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            productController.run();  // Aquí invocas el menú de productos
        };
    }
}