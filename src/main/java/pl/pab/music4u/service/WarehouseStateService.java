package pl.pab.music4u.service;

import pl.pab.music4u.entity.ArtistEntity;
import pl.pab.music4u.entity.WarehouseStateEntity;

public interface WarehouseStateService {
    WarehouseStateEntity findById(Long id);
    Long map(WarehouseStateEntity warehouseStateEntity);
}
