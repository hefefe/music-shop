package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.OrderElementsEntity;

@Mapper(componentModel = "spring")
public interface OrderElementsMapper {


    OrderElementsEntity dtoToEntity(OrderElementsDTO orderElementsDTO);
    OrderElementsDTO entityToDTO(OrderElementsEntity orderElementsEntity);
}
