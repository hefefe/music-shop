package pl.pab.music4u.service;

import pl.pab.music4u.entity.OrderElementsEntity;

public interface OrderElementsService {
    OrderElementsEntity findById(Long id);
    Long map(OrderElementsEntity orderElementsEntity);
}
