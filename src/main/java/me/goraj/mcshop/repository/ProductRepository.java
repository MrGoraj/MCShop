package me.goraj.mcshop.repository;

import me.goraj.mcshop.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
