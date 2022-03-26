package me.goraj.mcshop.repository;

import me.goraj.mcshop.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
