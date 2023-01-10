package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.ArtistEntity;
import pl.pab.music4u.exception.ArtistNotFoundException;
import pl.pab.music4u.exception.GenreNotFoundException;
import pl.pab.music4u.mapper.ArtistMapper;
import pl.pab.music4u.repository.ArtistRepository;

@Service
@RequiredArgsConstructor
public class ArtistServiceImpl implements ArtistService {
    private ArtistRepository artistRepository;
    private ArtistMapper artistMapper;

    @Override
    public ArtistEntity findById(Long id) {
        return artistRepository.findById(id).orElseThrow(ArtistNotFoundException::new);
    }

    @Override
    public Long map(ArtistEntity artistEntity) {
        return artistEntity.getId();
    }
}
