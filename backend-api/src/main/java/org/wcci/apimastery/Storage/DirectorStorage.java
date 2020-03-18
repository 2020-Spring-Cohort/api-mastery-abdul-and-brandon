package org.wcci.apimastery.Storage;

import org.hibernate.mapping.Collection;
import org.wcci.apimastery.Models.Director;

import java.util.Optional;

public interface DirectorStorage {
    Collection<Director> findAllDirectors();

    void store(Director director);

    Optional<Director> findDirectorById(Long id);

    Optional<Director> findDirectorByName(String name);

    Optional<Director> findDirectorByAge(int age);


}
