package pl.pab.music4u.service;

import pl.pab.music4u.entity.CustomerEntity;

public interface CustomerService {
    CustomerEntity findById(Long id);
    Long map(CustomerEntity customerEntity);
}
