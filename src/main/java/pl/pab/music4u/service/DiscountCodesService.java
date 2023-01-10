package pl.pab.music4u.service;

import pl.pab.music4u.entity.DiscountCodesEntity;

public interface DiscountCodesService {
    DiscountCodesEntity findById(Long id);
    Long map(DiscountCodesEntity discountCodesEntity);
}
