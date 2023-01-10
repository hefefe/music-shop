package pl.pab.music4u.service;

import pl.pab.music4u.entity.PaymentEntity;

public interface PaymentService {
    PaymentEntity findById(Long id);
    Long map(PaymentEntity paymentEntity);
}
