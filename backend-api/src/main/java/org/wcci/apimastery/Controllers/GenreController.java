package org.wcci.apimastery.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.apimastery.Models.Genre;

import org.wcci.apimastery.Storage.GenreStorage;
import org.wcci.apimastery.Storage.MovieStorage;


import java.util.Collection;
import java.util.Optional;

@RequestMapping("/Genres")
@RestController

public class GenreController {

    private GenreStorage genreStorage;
    private MovieStorage movieStorage;

    public GenreController(GenreStorage genreStorage, MovieStorage movieStorage){
        this.genreStorage = genreStorage;
        this.movieStorage = movieStorage;
    }

    @GetMapping
    public Collection<Genre> retrieveDirectors() {return GenreStorage.findAllGenres();}

    @GetMapping("/{title")
    public Genre showGenreByTitle(@PathVariable String title){
        Optional<Genre> retrievedGenre = genreStorage.findByGenreTitle(title);

        return retrievedGenre.orElse( null);

    }

    @GetMapping("/{genreDirector")
    public Genre showGenreByMovie(@PathVariable String genreDirector){
        Optional<Genre> retrievedGenre = genreStorage.findGenreByDirectorName(genreDirector);

        return retrievedGenre.orElse( null);

    }

    @GetMapping("/{movieTitle}")
    public Genre showGenreMovieTitle(@PathVariable String movieTitle){
        Optional<Movie> retrievedMovie = movieStorage.findMovieByTitle(movieTitle);

        return retrievedMovie.map(Movie::getGenre).orElse( null);
    }
}
