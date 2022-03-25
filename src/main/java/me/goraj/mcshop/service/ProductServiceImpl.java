package me.goraj.mcshop.service;

import me.goraj.mcshop.model.Product;
import me.goraj.mcshop.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Min;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Product> findById(@Min(value = 1L, message = "Invalid product ID.") long id) {
        return repository.findById(id);
    }

    @Override
    public Product create(Product product) {
        return repository.save(product);
    }

    @Override
    public void update(Long id, Product product) {
        Product productToUpdate = repository.findById(id).get();
        productToUpdate.setImage(product.getImage());
        productToUpdate.setName(product.getName());
        productToUpdate.setDescription(product.getDescription());
        productToUpdate.setPrice(product.getPrice());
        repository.save(productToUpdate);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}