package org.wcci.apimastery.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.apimastery.Models.Director;
import org.wcci.apimastery.Storage.ArtistStorage;
import org.wcci.apimastery.Storage.DirectorStorage;
import org.wcci.apimastery.models.Artist;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/directors")

public class DirectorController {

    private DirectorStorage directorStorage;

    public DirectorController(DirectorStorage directorStorage) { this.directorStorage = directorStorage;}

    @GetMapping
    public Collection<Director>
}