package me.goraj.mcshop.service;

import me.goraj.mcshop.model.Order;
import me.goraj.mcshop.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

@Service
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
    @Transactional
    public Order create(Order order) {
        order.setPurchaseDate(LocalDate.now());
        return repository.save(order);
    }

    @Override
    @Transactional
    public void update(Long id, Order order) {
        Order orderToUpdate = repository.findById(id).get();
        orderToUpdate.setCustomerName(order.getCustomerName());
        orderToUpdate.setPurchaseDate(order.getPurchaseDate());
        orderToUpdate.setPurchasedProduct(order.getPurchasedProduct());
        repository.save(orderToUpdate);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
