package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.AdressEntity;
import pl.pab.music4u.exception.AdressNotFoundException;
import pl.pab.music4u.mapper.AdressMapper;
import pl.pab.music4u.repository.AdressRepository;

@Service
@RequiredArgsConstructor
public class AdressServiceImpl implements AdressService{
    private final AdressRepository adressRepository;
    private final AdressMapper adressMapper;
    @Override
    public AdressEntity findById(Long id) {
        return adressRepository.findById(id).orElseThrow(AdressNotFoundException::new);
    }

    @Override
    public Long map(AdressEntity adressEntity) {
        return adressEntity.getId();
    }
}
