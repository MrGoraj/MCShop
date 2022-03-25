package me.goraj.mcshop.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.goraj.mcshop.model.Payment;
import me.goraj.mcshop.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;

@Service
public class PaymentServiceImpl {

    ObjectMapper objectMapper = new ObjectMapper();

    private final PaymentRepository repository;

    public PaymentServiceImpl(PaymentRepository repository) {
        this.repository = repository;
    }

    public Payment paymentVerification(Long userId, Long serviceId, String smsCode) throws IOException {
        assert false;
        String api = "https://microsms.pl/api/v2/multi.php?userid=" + userId + "&code=" + serviceId + "&serviceid=" + smsCode;

        JsonNode paymentNode = objectMapper.readTree(new URL(api));

        String connect = paymentNode.get("connect").asText();
        int errorCode = paymentNode.get("errorCode").asInt();
        String message = paymentNode.get("message").asText();
        return null;
    }
}
