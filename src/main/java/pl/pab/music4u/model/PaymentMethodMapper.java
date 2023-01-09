package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.PaymentMethodEntity;

@Mapper(componentModel = "spring")
public interface PaymentMethodMapper {


    PaymentMethodEntity dtoToEntity(PaymentMethodDTO DTO);
    PaymentMethodDTO entityToDTO(PaymentMethodEntity Entity);
}
