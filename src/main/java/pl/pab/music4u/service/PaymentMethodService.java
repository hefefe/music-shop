package pl.pab.music4u.service;

import pl.pab.music4u.entity.PaymentMethodEntity;

public interface PaymentMethodService {
    PaymentMethodEntity findById(Long id);
    Long map(PaymentMethodEntity paymentMethodEntity);
}
