package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.WarehouseEntity;

@Mapper(componentModel = "spring")
public interface WarehouseMapper {


    WarehouseEntity dtoToEntity(WarehouseDTO warehouseDTO);
    WarehouseDTO entityToDTO(WarehouseEntity warehouseEntity);
}
