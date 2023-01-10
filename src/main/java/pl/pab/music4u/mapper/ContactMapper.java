package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.ContactEntity;
import pl.pab.music4u.model.ContactDTO;

@Mapper(componentModel = "spring")
public interface ContactMapper {


    ContactEntity dtoToEntity(ContactDTO contactDTO);
    ContactDTO entityToDTO(ContactEntity contactEntity);
}
