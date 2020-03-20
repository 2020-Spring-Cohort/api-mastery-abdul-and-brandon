package org.wcci.apimastery.Storage;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.Entities.Director;
import org.wcci.apimastery.Entities.Genre;
import org.wcci.apimastery.Entities.Movie;


import java.util.Optional;

public interface MovieRepository extends CrudRepository<Movie, Long> {

    Optional<Movie> findByTitle(String title);

    Iterable<Movie> findMoviesByDirector(Director director);

    Iterable<Movie> findMoviesByDirectorName(String name);

    Iterable<Movie> findMoviesByGenre(Genre genre);

    Iterable<Movie> findMoviesByTitle(String title);
}
