package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.WarehouseStateEntity;
import pl.pab.music4u.exception.GenreNotFoundException;
import pl.pab.music4u.exception.WarehouseStateNotFoundException;
import pl.pab.music4u.mapper.WarehouseMapper;
import pl.pab.music4u.mapper.WarehouseStateMapper;
import pl.pab.music4u.repository.WarehouseStateRepository;

@Service
@RequiredArgsConstructor
public class WarehouseStateServiceImpl implements WarehouseStateService {
    private final WarehouseStateRepository warehouseStateRepository;
    private final WarehouseStateMapper warehouseStateMapper;
    @Override
    public WarehouseStateEntity findById(Long id) {
        return warehouseStateRepository.findById(id).orElseThrow(WarehouseStateNotFoundException::new);
    }

    @Override
    public Long map(WarehouseStateEntity warehouseStateEntity) {
        return warehouseStateEntity.getId();
    }
}
