package org.wcci.apimastery.Storage;

import org.wcci.apimastery.Models.Genre;


import java.util.Collection;
import java.util.Optional;


public interface GenreStorage {
    Collection<Genre> findAllGenres();
    Optional<Genre> findGenreById(Long id);
    Optional<Genre> findByGenreTitle(String title);
    Optional<Genre> findGenreByDirectorName(String directorName);
    void store(Genre genreToStore);
}
