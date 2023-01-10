package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.OrderStatusEntity;
import pl.pab.music4u.model.OrderStatusDTO;

@Mapper(componentModel = "spring")
public interface OrderStatusMapper {


    OrderStatusEntity dtoToEntity(OrderStatusDTO orderStatusDTO);
    OrderStatusDTO entityToDTO(OrderStatusEntity orderStatusEntity);
}
