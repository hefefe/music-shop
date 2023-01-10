package pl.pab.music4u.service;

import pl.pab.music4u.entity.OrderEntity;

public interface OrderService {
    OrderEntity findById(Long id);
    Long map(OrderEntity orderEntity);
}
