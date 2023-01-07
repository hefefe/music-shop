package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.ArtistEntity;


@Mapper(componentModel = "spring")
public interface ArtistMapper {

    ArtistEntity dtoToEntity(ArtistDTO artistDTO);
    ArtistDTO entityToDTO(ArtistEntity artistEntity);
}