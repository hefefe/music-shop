package pl.pab.music4u.service;

import pl.pab.music4u.entity.GenreEntity;
import pl.pab.music4u.model.GenreDTO;

import java.util.List;

public interface GenreService {
    List<GenreDTO> getAllGenres();
    GenreDTO addGenre(GenreDTO genreDTO);
    GenreDTO updateGenre(GenreDTO genreDTO);
    GenreDTO getGenreById(Long id);
    void deleteGenre(Long id);
    GenreEntity findById(Long id);
    Long map(GenreEntity genreEntity);
}
