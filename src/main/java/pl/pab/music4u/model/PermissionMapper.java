package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.PermissionEntity;

@Mapper(componentModel = "spring")
public interface PermissionMapper {


    PermissionEntity dtoToEntity(PermissionDTO permissionDTO);
    PermissionDTO entityToDTO(PermissionEntity permissionEntity);
}