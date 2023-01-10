package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.OrderEntity;
import pl.pab.music4u.model.OrderDTO;
import pl.pab.music4u.service.CustomerService;
import pl.pab.music4u.service.EmployeeService;
import pl.pab.music4u.service.OrderStatusService;

@Mapper(componentModel = "spring", uses = {OrderStatusService.class, EmployeeService.class, CustomerService.class})
public interface OrderMapper {

    @Mapping(source = "orderStatusId", target="orderStatusEntity")
    @Mapping(source = "customerId", target="customerEntity")
    @Mapping(source = "employeeId", target="employeeEntity")
    OrderEntity dtoToEntity(OrderDTO orderDTO);
    @Mapping(source = "orderStatusEntity", target="orderStatusId")
    @Mapping(source = "customerEntity", target="customerId")
    @Mapping(source = "employeeEntity", target="employeeId")
    OrderDTO entityToDTO(OrderEntity orderEntity);
}
