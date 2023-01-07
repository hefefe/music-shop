package pl.pab.music4u.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pab.music4u.entity.ContactEntity;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity,Long> {
}
