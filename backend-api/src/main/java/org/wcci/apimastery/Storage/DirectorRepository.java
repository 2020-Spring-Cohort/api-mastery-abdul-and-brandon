package org.wcci.apimastery.Storage;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DirectorRepository extends CrudRepository<Director, Long> {
    Optional<Director> findByName(String name);

    Optional<Director> findByAge(String genre);


}
