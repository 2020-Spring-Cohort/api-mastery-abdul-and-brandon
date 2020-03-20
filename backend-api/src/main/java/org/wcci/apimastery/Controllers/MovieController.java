package org.wcci.apimastery.Controllers;

import org.springframework.web.bind.annotation.*;
import org.wcci.apimastery.Models.Director;
import org.wcci.apimastery.Models.Genre;
import org.wcci.apimastery.Models.Movie;
import org.wcci.apimastery.Storage.DirectorStorage;
import org.wcci.apimastery.Storage.GenreStorage;
import org.wcci.apimastery.Storage.MovieStorage;

import javax.swing.text.html.Option;
import java.util.Collection;
import java.util.Optional;


@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieStorage movieStorage;
    private DirectorStorage directorStorage;
    private GenreStorage genreStorage;

    public MovieController(MovieStorage movieStorage, DirectorStorage directorStorage, GenreStorage genreStorage) {
        this.movieStorage = movieStorage;
        this.directorStorage = directorStorage;
        this.genreStorage = genreStorage;
    }

    @GetMapping
    public Collection<Movie> showAllMovies() {return (Collection<Movie>) movieStorage.findAllMovies();}

    @GetMapping("/{title}")
    public Movie showMovieByTitle(@PathVariable String title){
        Optional<Movie> retrievedMovie = movieStorage.findMovieByTitle(title);

        return retrievedMovie.orElse( null);
    }

    @GetMapping("/director/{directorName")
    public Collection<Movie> showMoviesByDirectorName(@PathVariable String directorName) {
        Optional<Director> retrievedDirector = directorStorage.findDirectorByName(directorName);

        return  retrievedDirector.map(Director::getMovies).orElse( null);
    }

    @GetMapping("/genre{genreName}")
    public Collection<Genre> showMoviesByGenreName(@PathVariable String genreName) {
        Optional<Genre> retrievedGenre = genreStorage.findByGenreTitle(genreName);

        return retrievedGenre.map(Genre::getMovies).orElse(null);
    }

    @DeleteMapping("/{title}")
    public void deleteMovieByTitle(@PathVariable String title){
        Optional<Movie> movieOptional = movieStorage.findSongByTitle(title);

        movieOptional.ifPresent(movie -> movieStorage.remove(movie));
    }

    @PutMapping("/{id}/comment")
    public Movie patchMovie(@PathVariable Long id, @RequestBody String comment) {

        Optional<Movie> movieOptional = movieStorage.findMovieById(id);

        if (movieOptional.isPresent()) {
            Movie oldMovie = movieOptional.get();
            movie.getComments().add(comment);
            return movieStorage.store(oldMovie);
        }
        return null;
    }

    @PatchMapping("/{id}/rating")
    public Movie patchMovieRating(@PathVariable Long id, @RequestBody String rating) {

        Optional<Movie> movieOptional = movieStorage.findMovieById(id);

        if (movieOptional.isPresent()) {
            Movie oldMovie = movieOptional.get();

            oldMovie.getRatings().add(Integer.parseInt(rating));

            return movieStorage.store(oldMovie);
        }
        return null;
    }
}
