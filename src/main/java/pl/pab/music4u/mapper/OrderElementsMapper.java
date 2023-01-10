package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.OrderElementsEntity;
import pl.pab.music4u.model.OrderElementsDTO;
import pl.pab.music4u.service.DiscountCodesService;
import pl.pab.music4u.service.OrderService;
import pl.pab.music4u.service.ProductService;

@Mapper(componentModel = "spring", uses = {DiscountCodesService.class, ProductService.class, OrderService.class})
public interface OrderElementsMapper {

    @Mapping(source = "discountCodesId", target="discountCodesEntity")
    @Mapping(source = "productId", target="productEntity")
    @Mapping(source = "orderId", target="orderEntity")
    OrderElementsEntity dtoToEntity(OrderElementsDTO orderElementsDTO);
    @Mapping(source = "discountCodesEntity", target="discountCodesId")
    @Mapping(source = "productEntity", target="productId")
    @Mapping(source = "orderEntity", target="orderId")
    OrderElementsDTO entityToDTO(OrderElementsEntity orderElementsEntity);
}
