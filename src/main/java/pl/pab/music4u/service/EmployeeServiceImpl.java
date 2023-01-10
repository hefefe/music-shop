package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.EmployeeEntity;
import pl.pab.music4u.exception.EmployeeNotFoundException;
import pl.pab.music4u.mapper.EmployeeMapper;
import pl.pab.music4u.repository.EmployeeRepository;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;
    @Override
    public EmployeeEntity findById(Long id) {
        return employeeRepository.findById(id).orElseThrow(EmployeeNotFoundException::new);
    }

    @Override
    public Long map(EmployeeEntity employeeEntity) {
        return employeeEntity.getId();
    }
}
