package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.WarehouseEntity;
import pl.pab.music4u.exception.WarehouseStateNotFoundException;
import pl.pab.music4u.mapper.WarehouseMapper;
import pl.pab.music4u.repository.WarehouseRepository;

@Service
@RequiredArgsConstructor
public class WarehouseServiceImpl implements WarehouseService{
    private final WarehouseRepository warehouseRepository;
    private final WarehouseMapper warehouseMapper;
    @Override
    public WarehouseEntity findById(Long id) {
        return warehouseRepository.findById(id).orElseThrow(WarehouseStateNotFoundException::new);
    }

    @Override
    public Long map(WarehouseEntity warehouseEntity) {
        return warehouseEntity.getId();
    }
}
