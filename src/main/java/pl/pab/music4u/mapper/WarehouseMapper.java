package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.WarehouseEntity;
import pl.pab.music4u.model.WarehouseDTO;
import pl.pab.music4u.service.AdressService;
import pl.pab.music4u.service.ContactService;
import pl.pab.music4u.service.PermissionService;

@Mapper(componentModel = "spring", uses = {AdressService.class})
public interface WarehouseMapper {

    @Mapping(source = "adressId", target="adressEntity")
    WarehouseEntity dtoToEntity(WarehouseDTO warehouseDTO);
    @Mapping(source = "adressEntity", target="adressId")
    WarehouseDTO entityToDTO(WarehouseEntity warehouseEntity);
}
