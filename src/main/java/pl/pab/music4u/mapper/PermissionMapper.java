package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.PermissionEntity;
import pl.pab.music4u.model.PermissionDTO;

@Mapper(componentModel = "spring")
public interface PermissionMapper {


    PermissionEntity dtoToEntity(PermissionDTO permissionDTO);
    PermissionDTO entityToDTO(PermissionEntity permissionEntity);
}
