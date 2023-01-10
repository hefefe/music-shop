package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.PaymentEntity;
import pl.pab.music4u.exception.PaymentNotFoundException;
import pl.pab.music4u.mapper.PaymentMapper;
import pl.pab.music4u.repository.PaymentMethodRepository;
import pl.pab.music4u.repository.PaymentRepository;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService{
    private final PaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;
    @Override
    public PaymentEntity findById(Long id) {
        return paymentRepository.findById(id).orElseThrow(PaymentNotFoundException::new);
    }

    @Override
    public Long map(PaymentEntity paymentEntity) {
        return paymentEntity.getId();
    }
}
