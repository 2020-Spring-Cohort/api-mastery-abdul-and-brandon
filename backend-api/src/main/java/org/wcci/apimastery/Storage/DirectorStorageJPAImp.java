package org.wcci.apimastery.Storage;

import org.hibernate.mapping.Collection;
import org.springframework.stereotype.Service;
import org.wcci.apimastery.Models.Director;
import org.wcci.apimastery.models.Artist;

import java.util.Optional;

@Service
public class DirectorStorageJPAImp implements DirectorStorage {

    private DirectorRepository directorRepository;

    public DirectorStorageJPAImp(DirectorRepository directorRepository) {this.directorRepository = directorRepository}
    @Override
    public Collection<Director> findAllDirectors() { return (Collection<Director>) directorRepository.findAll();

    }

    @Override
    public void store(Director director) { directorRepository.save(directors);

    }

    @Override
    public Optional<Director> findDirectorById(Long id) { return directorRepository.findById(id);

    }

    @Override
    public Optional<Director> findDirectorByName(String name) { return directorRepository.findByName(name);

    }

    @Override
    public Optional<Director> findDirectorByAge(int age) { return directorRepository.findByAge(age);

    }
}
