package org.wcci.apimastery.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.apimastery.Models.Genre;
import org.wcci.apimastery.Storage.AlbumStorage;
import org.wcci.apimastery.Storage.GenreStorage;
import org.wcci.apimastery.models.Album;

import java.util.Collection;

@RequestMapping("/Genres")
@RestController

public class GenreController {

    private GenreStorage genreStorage;

    public GenreController(GenreStorage genreStorage) {this.genreStorage = genreStorage;}

    @GetMapping
    public Collection<Genre> retrieveDirectors() {return GenreStorage.findAllGenres();}
}
