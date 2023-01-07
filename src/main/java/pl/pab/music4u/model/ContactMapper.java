package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.ContactEntity;

@Mapper(componentModel = "spring")
public interface ContactMapper {


    ContactEntity dtoToEntity(ContactDTO contactDTO);
    ContactDTO entityToDTO(ContactEntity contactEntity);
}
