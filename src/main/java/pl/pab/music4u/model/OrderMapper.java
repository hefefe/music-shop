package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.OrderEntity;

@Mapper(componentModel = "spring")
public interface OrderMapper {


    OrderEntity dtoToEntity(OrderDTO orderDTO);
    OrderDTO entityToDTO(OrderEntity orderEntity);
}
