package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.ArtistEntity;


@Mapper(componentModel = "spring")
public interface ArtistMapper {
    ArtistMapper INSTANCE = Mappers.getMapper(ArtistMapper.class);

    ArtistEntity dtoToEntity(ArtistDTO artistDTO);
    ArtistDTO entityToDTO(ArtistEntity artistEntity);
}
