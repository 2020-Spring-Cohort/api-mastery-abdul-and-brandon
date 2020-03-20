package org.wcci.apimastery.Controllers;

import org.hibernate.mapping.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD
import org.wcci.apimastery.Models.Director;

=======
import org.wcci.apimastery.Entities.Director;
import org.wcci.apimastery.Storage.ArtistStorage;
>>>>>>> dev
import org.wcci.apimastery.Storage.DirectorStorage;

<<<<<<< HEAD

import java.util.Optional;
=======
import java.util.Collection;
>>>>>>> dev

@RestController
@RequestMapping("/directors")

public class DirectorController {

    private DirectorStorage directorStorage;

    public DirectorController(DirectorStorage directorStorage) { this.directorStorage = directorStorage;}

    @GetMapping
    public Collection showAllDirectors() {return directorStorage.findAllDirectors();}

    @GetMapping("/{directorName}")
    public Director showDirectorByName(@PathVariable String directorName) {
        Optional<Director> retrievedDirector = directorStorage.findDirectorByName(directorName);

        return retrievedDirector.orElse( null);
    }


}
