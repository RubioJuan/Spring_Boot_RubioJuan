package com.example.Taller_2.Controller;

import com.example.Taller_2.Model.Product;
import com.example.Taller_2.Service.ProductService;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class ProductController {

    private final ProductService productService;
    private final Scanner scanner = new Scanner(System.in); // Instancia del scanner en lugar de inyectarlo

    // Constructor con inyección de dependencias
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println("\nGestión de productos:");
            System.out.println("1. Ver todos los productos");
            System.out.println("2. Agregar un producto");
            System.out.println("3. Buscar producto por ID");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (option) {
                case 1:
                    productService.getAllProducts().forEach(System.out::println);
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    findProductById();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private void addProduct() {
        System.out.print("Ingrese el ID del producto: ");
        Long id = scanner.nextLong();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el nombre del producto: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        Product product = new Product(id, name, price);
        productService.addProduct(product);
        System.out.println("Producto agregado: " + product);
    }

    private void findProductById() {
        System.out.print("Ingrese el ID del producto: ");
        Long id = scanner.nextLong();
        scanner.nextLine(); // Limpiar el buffer

        Product product = productService.findProductById(id);
        if (product != null) {
            System.out.println("Producto encontrado: " + product);
        } else {
            System.out.println("Producto no encontrado");
        }
    }
}
