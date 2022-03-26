package me.goraj.mcshop.service;

import me.goraj.mcshop.model.Order;
import me.goraj.mcshop.repository.OrderRepository;

import java.time.LocalDate;
import java.util.Optional;

public class OrderServiceImpl implements OrderService {

    OrderRepository repository;

    @Override
    public Iterable<Order> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Order> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Order create(Order order) {
        order.setPurchaseDate(LocalDate.now());
        return repository.save(order);
    }

    @Override
    public void update(Long id, Order order) {
        Order orderToUpdate = repository.findById(id).get();
        orderToUpdate.setCustomerName(order.getCustomerName());
        orderToUpdate.setPurchaseDate(order.getPurchaseDate());
        repository.save(orderToUpdate);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
