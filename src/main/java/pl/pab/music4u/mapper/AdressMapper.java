package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.AdressEntity;
import pl.pab.music4u.model.AdressDTO;

@Mapper(componentModel = "spring")
public interface AdressMapper {

    AdressEntity dtoToEntity(AdressDTO adressDTO);
    AdressDTO entityToDTO(AdressEntity adressEntity);
}
