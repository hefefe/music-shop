package pl.pab.music4u.service;

import pl.pab.music4u.entity.EmployeeEntity;

public interface EmployeeService {
    EmployeeEntity findById(Long id);
    Long map(EmployeeEntity employeeEntity);
}
