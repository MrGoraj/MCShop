package me.goraj.mcshop.service;

import me.goraj.mcshop.model.Payment;

public interface PaymentService {

    Payment smsPaymentVerification(Long userId, Long serviceId, String smsCode);

}
