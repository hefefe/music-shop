package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.ContactEntity;
import pl.pab.music4u.exception.ContactNotFoundException;
import pl.pab.music4u.mapper.ContactMapper;
import pl.pab.music4u.repository.ContactRepository;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService{
    private final ContactRepository contactRepository;
    private final ContactMapper contactMapper;
    @Override
    public ContactEntity findById(Long id) {
        return contactRepository.findById(id).orElseThrow(ContactNotFoundException::new);
    }

    @Override
    public Long map(ContactEntity contactEntity) {
        return contactEntity.getId();
    }
}
