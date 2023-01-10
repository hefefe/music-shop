package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.PaymentMethodEntity;
import pl.pab.music4u.exception.PaymentMethodNotFoundException;
import pl.pab.music4u.mapper.PaymentMapper;
import pl.pab.music4u.mapper.PaymentMethodMapper;
import pl.pab.music4u.repository.PaymentMethodRepository;

@Service
@RequiredArgsConstructor
public class PaymentMethodServiceImpl implements PaymentMethodService{
    private final PaymentMethodRepository paymentMethodRepository;
    private final PaymentMethodMapper paymentMethodMapper;
    @Override
    public PaymentMethodEntity findById(Long id) {
        return paymentMethodRepository.findById(id).orElseThrow(PaymentMethodNotFoundException::new);
    }

    @Override
    public Long map(PaymentMethodEntity paymentMethodEntity) {
        return paymentMethodEntity.getId();
    }
}
