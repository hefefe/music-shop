package pl.pab.music4u.service;

import pl.pab.music4u.entity.ArtistEntity;
import pl.pab.music4u.entity.WarehouseEntity;

public interface WarehouseService {
    WarehouseEntity findById(Long id);
    Long map(WarehouseEntity warehouseEntity);
}
