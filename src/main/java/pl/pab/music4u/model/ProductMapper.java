package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.ProductEntity;

@Mapper(componentModel = "spring")
public interface ProductMapper {


    ProductEntity dtoToEntity(ProductDTO productDTO);
    ProductDTO entityToDTO(ProductEntity productEntity);
}
