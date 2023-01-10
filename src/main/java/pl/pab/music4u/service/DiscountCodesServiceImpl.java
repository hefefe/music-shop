package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.DiscountCodesEntity;
import pl.pab.music4u.exception.DiscountCodesNotFound;
import pl.pab.music4u.mapper.DiscountCodesMapper;
import pl.pab.music4u.repository.DiscountCodesRepository;

@Service
@RequiredArgsConstructor
public class DiscountCodesServiceImpl implements DiscountCodesService {
    private final DiscountCodesRepository discountCodesRepository;
    private final DiscountCodesMapper discountCodesMapper;
    @Override
    public DiscountCodesEntity findById(Long id) {
        return discountCodesRepository.findById(id).orElseThrow(DiscountCodesNotFound::new);
    }

    @Override
    public Long map(DiscountCodesEntity discountCodesEntity) {
        return discountCodesEntity.getId();
    }
}
