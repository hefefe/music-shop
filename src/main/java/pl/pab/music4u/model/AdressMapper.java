package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.AdressEntity;

@Mapper(componentModel = "spring")
public interface AdressMapper {
    AdressMapper INSTANCE = Mappers.getMapper(AdressMapper.class);

    AdressEntity dtoToEntity(AdressDTO adressDTO);
    AdressDTO entityToDTO(AdressEntity adressEntity);
}
