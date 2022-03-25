package me.goraj.mcshop.controller;

import me.goraj.mcshop.model.Product;
import me.goraj.mcshop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = { "", "/" })
    public @NotNull Iterable<Product> getProducts() {
        return productService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Product> getProduct(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PostMapping(value = { "", "/" })
    public @NotNull Product saveProduct(@RequestBody Product product) {
        return productService.create(new Product());
    }
}