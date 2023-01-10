package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.GenreEntity;
import pl.pab.music4u.model.GenreDTO;

@Mapper(componentModel = "spring")
public interface GenreMapper {
    GenreEntity dtoToEntity(GenreDTO genreDTO);
    GenreDTO entityToDTO(GenreEntity genreEntity);
}
