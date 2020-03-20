package org.wcci.apimastery.Entities;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity

public class Director {
    private String name;

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "director")
    Collection<Genre> genres;

    protected Director() {

    }
public Director(String name) {
        this.name=name;
}

public Long getId() {
        return id;
}

public Collection<Genre> getAlbums() {
        return genres;
}

public String getName() {
        return name;
}

}
