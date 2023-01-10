package pl.pab.music4u.service;

import pl.pab.music4u.entity.ContactEntity;

public interface ContactService {
    ContactEntity findById(Long id);
    Long map(ContactEntity contactEntity);
}
