package org.wcci.apimastery.Storage;

import org.wcci.apimastery.Models.Genre;
import org.wcci.apimastery.Models.Movie;
import org.wcci.apimastery.Models.Director;

import java.util.Optional;

public interface MovieStorage {


    Optional<Movie> findSongByTitle(String title);

    Iterable<Movie> findAllByDirector(Director director);

    Iterable<Movie> findAllByArtistName(String name);


    Iterable<Movie> findAllByAlbum(Genre genre);

    Iterable<Movie> findAllyByAlbumTitle(String title);

    Iterable<Movie> findAllMovies();


}