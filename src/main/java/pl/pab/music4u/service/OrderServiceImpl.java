package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.OrderEntity;
import pl.pab.music4u.exception.OrderNotFoundException;
import pl.pab.music4u.mapper.OrderMapper;
import pl.pab.music4u.repository.OrderRepository;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    @Override
    public OrderEntity findById(Long id) {
        return orderRepository.findById(id).orElseThrow(OrderNotFoundException::new);
    }

    @Override
    public Long map(OrderEntity orderEntity) {
        return orderEntity.getId();
    }
}
