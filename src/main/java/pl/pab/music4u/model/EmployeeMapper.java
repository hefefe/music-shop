package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.pab.music4u.entity.EmployeeEntity;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {


    EmployeeEntity dtoToEntity(EmployeeDTO employeeDTO);
    EmployeeDTO entityToDTO(EmployeeEntity employeeEntity);
}
