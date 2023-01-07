package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.PaymentEntity;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    PaymentMapper INSTANCE = Mappers.getMapper(PaymentMapper.class);

    PaymentEntity dtoToEntity(PaymentDTO paymentDTO);
    PaymentDTO entityToDTO(PaymentEntity paymentEntity);
}
