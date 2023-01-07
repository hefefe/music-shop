package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.ProductTypeEntity;

@Mapper(componentModel = "spring")
public interface ProductTypeMapper {

    ProductTypeMapper INSTANCE = Mappers.getMapper(ProductTypeMapper.class);

    ProductTypeEntity dtoToEntity(ProductTypeDTO productTypeDTO);
    ProductTypeDTO entityToDTO(ProductTypeEntity productTypeEntity);
}
