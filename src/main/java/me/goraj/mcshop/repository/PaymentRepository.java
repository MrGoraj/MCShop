package me.goraj.mcshop.repository;

import me.goraj.mcshop.model.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
