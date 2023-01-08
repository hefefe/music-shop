package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.GenreEntity;
import pl.pab.music4u.exception.GenreNotFoundException;
import pl.pab.music4u.model.GenreDTO;
import pl.pab.music4u.model.GenreMapper;
import pl.pab.music4u.repository.GenreRepository;

import javax.persistence.TypedQuery;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService{
    private final GenreRepository genreRepository;
    private final GenreMapper genreMapper;
    @Override
    public List<GenreDTO> getAllGenres() {
        return genreRepository.findAll().stream().map(genreMapper::entityToDTO).collect(Collectors.toList());
    }

    @Override
    public GenreDTO addGenre(GenreDTO genreDTO) {
        GenreEntity genreEntity = genreRepository.save(genreMapper.dtoToEntity(genreDTO));
        return genreMapper.entityToDTO(genreEntity);
    }

    @Override
    public GenreDTO updateGenre(GenreDTO genreDTO) {
        GenreEntity genreEntity = genreRepository.save(genreMapper.dtoToEntity(genreDTO));
        return genreMapper.entityToDTO(genreEntity);
    }

    @Override
    public GenreDTO getGenreById(Long id) {
        return genreRepository.findById(id).map(genreMapper::entityToDTO).orElseThrow(GenreNotFoundException::new);
    }

    @Override
    public void deleteGenre(Long id) {
        genreRepository.deleteById(id);
    }

}
