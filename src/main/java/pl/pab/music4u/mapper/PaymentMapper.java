package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.PaymentEntity;
import pl.pab.music4u.model.PaymentDTO;
import pl.pab.music4u.service.OrderService;
import pl.pab.music4u.service.PaymentMethodService;

@Mapper(componentModel = "spring", uses = {PaymentMethodService.class, OrderService.class})
public interface PaymentMapper {

    @Mapping(source = "paymentMethodId", target="paymentMethodEntity")
    @Mapping(source = "orderId", target="orderEntity")
    PaymentEntity dtoToEntity(PaymentDTO paymentDTO);
    @Mapping(source = "paymentMethodEntity", target="paymentMethodId")
    @Mapping(source = "orderEntity", target="orderId")
    PaymentDTO entityToDTO(PaymentEntity paymentEntity);
}
