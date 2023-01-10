package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.PaymentMethodEntity;
import pl.pab.music4u.model.PaymentMethodDTO;

@Mapper(componentModel = "spring")
public interface PaymentMethodMapper {


    PaymentMethodEntity dtoToEntity(PaymentMethodDTO DTO);
    PaymentMethodDTO entityToDTO(PaymentMethodEntity Entity);
}
