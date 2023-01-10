package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.ProductEntity;
import pl.pab.music4u.model.ProductDTO;
import pl.pab.music4u.service.ArtistService;
import pl.pab.music4u.service.GenreService;
import pl.pab.music4u.service.ProductTypeService;
import pl.pab.music4u.service.WarehouseStateService;

@Mapper(componentModel = "spring", uses = {GenreService.class,
        ArtistService.class,
        ProductTypeService.class,
        WarehouseStateService.class})
public interface ProductMapper {


    @Mapping(source = "genreId", target="genreEntity")
    @Mapping(source = "artistId", target="artistEntity")
    @Mapping(source = "productTypeId", target="productTypeEntity")
    @Mapping(source = "warehouseStateId", target="warehouseStateEntity")
    ProductEntity dtoToEntity(ProductDTO productDTO);
    @Mapping(source = "genreEntity", target="genreId")
    @Mapping(source = "artistEntity", target="artistId")
    @Mapping(source = "productTypeEntity", target="productTypeId")
    @Mapping(source = "warehouseStateEntity", target="warehouseStateId")
    ProductDTO entityToDTO(ProductEntity productEntity);
}
