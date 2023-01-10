package pl.pab.music4u.service;

import pl.pab.music4u.entity.OrderStatusEntity;

public interface OrderStatusService {
    OrderStatusEntity findById(Long id);
    Long map(OrderStatusEntity orderStatusEntity);
}
