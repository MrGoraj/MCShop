package me.goraj.mcshop.service;

import me.goraj.mcshop.model.Order;

import java.util.Optional;

public interface OrderService {

    Iterable<Order> findAll();

    Optional<Order> findById(Long id);

    Order create(Order order);

    void update(Long id, Order order);

    void delete(Long id);
}
