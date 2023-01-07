package pl.pab.music4u.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pab.music4u.entity.AdressEntity;
import pl.pab.music4u.entity.ArtistEntity;

@Repository
public interface ArtistRepository extends JpaRepository<ArtistEntity,Long> {
}
