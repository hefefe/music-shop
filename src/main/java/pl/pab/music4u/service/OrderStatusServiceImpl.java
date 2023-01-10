package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.OrderStatusEntity;
import pl.pab.music4u.exception.OrderStatusNotFoundException;
import pl.pab.music4u.mapper.OrderStatusMapper;
import pl.pab.music4u.repository.OrderStatusRepository;

@Service
@RequiredArgsConstructor
public class OrderStatusServiceImpl implements OrderStatusService{
    private final OrderStatusRepository orderStatusRepository;
    private final OrderStatusMapper orderStatusMapper;
    @Override
    public OrderStatusEntity findById(Long id) {
        return orderStatusRepository.findById(id).orElseThrow(OrderStatusNotFoundException::new);
    }

    @Override
    public Long map(OrderStatusEntity orderStatusEntity) {
        return orderStatusEntity.getId();
    }
}
