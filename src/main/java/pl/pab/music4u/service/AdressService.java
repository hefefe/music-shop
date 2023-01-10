package pl.pab.music4u.service;

import pl.pab.music4u.entity.AdressEntity;

public interface AdressService {
    AdressEntity findById(Long id);
    Long map(AdressEntity adressEntity);
}
