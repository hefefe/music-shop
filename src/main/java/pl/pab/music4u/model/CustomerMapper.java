package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.CustomerEntity;

@Mapper(componentModel = "spring")
public interface CustomerMapper {


    CustomerEntity dtoToEntity(CustomerDTO customerDTO);
    CustomerDTO entityToDTO(CustomerEntity customerEntity);
}
