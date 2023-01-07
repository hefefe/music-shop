package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.GenreEntity;

@Mapper(componentModel = "spring")
public interface GenreMapper {


    GenreEntity dtoToEntity(GenreDTO genreDTO);
    GenreDTO entityToDTO(GenreEntity genreEntity);
}
