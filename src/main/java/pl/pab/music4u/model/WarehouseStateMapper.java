package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.WarehouseStateEntity;

@Mapper(componentModel = "spring")
public interface WarehouseStateMapper {

    WarehouseStateEntity dtoToEntity(WarehouseStateDTO warehouseStateDTO);
    WarehouseStateDTO entityToDTO(WarehouseStateEntity warehouseStateEntity);
}
