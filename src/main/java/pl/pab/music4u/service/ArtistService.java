package pl.pab.music4u.service;

import pl.pab.music4u.entity.ArtistEntity;

public interface ArtistService {
    ArtistEntity findById(Long id);
    Long map(ArtistEntity artistEntity);
}
