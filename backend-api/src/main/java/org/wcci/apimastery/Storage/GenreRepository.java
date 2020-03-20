package org.wcci.apimastery.Storage;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.Entities.Genre;


public interface GenreRepository extends CrudRepository<Genre, Long> {
Optional<Genre> findById(Long genreToFind);
Optional<Genre> findByTitle(String title);
Optional<Genre> findByDirectorName(String directorname);

}
