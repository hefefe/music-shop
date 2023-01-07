package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.OrderStatusEntity;

@Mapper(componentModel = "spring")
public interface OrderStatusMapper {


    OrderStatusEntity dtoToEntity(OrderStatusDTO orderStatusDTO);
    OrderStatusDTO entityToDTO(OrderStatusEntity orderStatusEntity);
}
