package org.wcci.apimastery.Storage;

import org.wcci.apimastery.Entities.Genre;
import org.wcci.apimastery.Entities.Movie;
import org.wcci.apimastery.Entities.Director;

import java.util.Optional;

public interface MovieStorage {


    Optional<Movie> findSongByTitle(String title);

    Iterable<Movie> findAllByDirector(Director director);

    Iterable<Movie> findAllByArtistName(String name);


    Iterable<Movie> findAllByGenre(Genre genre);

    Iterable<Movie> findAllyByGenreTitle(String title);

    Iterable<Movie> findAllMovies();


}