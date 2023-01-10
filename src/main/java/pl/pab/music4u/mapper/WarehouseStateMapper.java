package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.WarehouseStateEntity;
import pl.pab.music4u.model.WarehouseStateDTO;
import pl.pab.music4u.service.WarehouseService;

@Mapper(componentModel = "spring", uses = {WarehouseService.class})
public interface WarehouseStateMapper {
    @Mapping(source = "warehouseId", target="warehouseEntity")
    WarehouseStateEntity dtoToEntity(WarehouseStateDTO warehouseStateDTO);
    @Mapping(source = "warehouseEntity", target="warehouseId")
    WarehouseStateDTO entityToDTO(WarehouseStateEntity warehouseStateEntity);
}
