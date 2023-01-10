package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.ProductTypeEntity;
import pl.pab.music4u.model.ProductTypeDTO;

@Mapper(componentModel = "spring")
public interface ProductTypeMapper {


    ProductTypeEntity dtoToEntity(ProductTypeDTO productTypeDTO);
    ProductTypeDTO entityToDTO(ProductTypeEntity productTypeEntity);
}
