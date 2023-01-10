package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.OrderElementsEntity;
import pl.pab.music4u.exception.OrderElementsNotFoundException;
import pl.pab.music4u.mapper.OrderElementsMapper;
import pl.pab.music4u.repository.OrderElementsRepository;

@Service
@RequiredArgsConstructor
public class OrderElementsServiceImpl implements OrderElementsService{
    private final OrderElementsRepository orderElementsRepository;
    private final OrderElementsMapper orderElementsMapper;
    @Override
    public OrderElementsEntity findById(Long id) {
        return orderElementsRepository.findById(id).orElseThrow(OrderElementsNotFoundException::new);
    }

    @Override
    public Long map(OrderElementsEntity orderElementsEntity) {
        return orderElementsEntity.getId();
    }
}
