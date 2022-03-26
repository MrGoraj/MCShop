package me.goraj.mcshop.service;

import me.goraj.mcshop.model.Product;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Validated
public interface ProductService {

    @NotNull Iterable<Product> findAll();

    Optional<Product> findById(@Min(value = 1L, message = "Invalid product ID.") long id);

    Product create(Product product);

    void update(Long id, Product product);

    void delete(Long id);
}
