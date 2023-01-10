package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.CustomerEntity;
import pl.pab.music4u.model.CustomerDTO;
import pl.pab.music4u.service.AdressService;
import pl.pab.music4u.service.ContactService;
import pl.pab.music4u.service.PermissionService;

@Mapper(componentModel = "spring", uses = {AdressService.class, ContactService.class, PermissionService.class})
public interface CustomerMapper {

    @Mapping(source = "adressId", target="adressEntity")
    @Mapping(source = "contactId", target="contactEntity")
    @Mapping(source = "permissionId", target="permissionEntity")
    CustomerEntity dtoToEntity(CustomerDTO customerDTO);
    @Mapping(source = "adressEntity", target="adressId")
    @Mapping(source = "contactEntity", target="contactId")
    @Mapping(source = "permissionEntity", target="permissionId")
    CustomerDTO entityToDTO(CustomerEntity customerEntity);
}
