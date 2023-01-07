package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.AdressEntity;

@Mapper(componentModel = "spring")
public interface AdressMapper {

    AdressEntity dtoToEntity(AdressDTO adressDTO);
    AdressDTO entityToDTO(AdressEntity adressEntity);
}
