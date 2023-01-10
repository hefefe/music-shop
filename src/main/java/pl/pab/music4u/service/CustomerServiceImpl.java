package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.CustomerEntity;
import pl.pab.music4u.exception.CustomerNotFoundException;
import pl.pab.music4u.mapper.CustomerMapper;
import pl.pab.music4u.repository.CustomerRepository;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    @Override
    public CustomerEntity findById(Long id) {
        return customerRepository.findById(id).orElseThrow(CustomerNotFoundException::new);
    }

    @Override
    public Long map(CustomerEntity customerEntity) {
        return customerEntity.getId();
    }
}
