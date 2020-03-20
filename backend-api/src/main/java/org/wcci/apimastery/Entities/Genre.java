package org.wcci.apimastery.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;


@Entity
public class Genre {

    private String name;
    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @ManyToOne
    private Director director;
    @OneToMany (mappedBy = "genre")
    private Collection<Movie>movies;

    public Genre(String name, Director director){
        this.name = name;
        this.director = director;
    }

    public Genre(String name, Director director, Collection<Movie> movies) {
        this.name = name;
        this.director = director;
        this.movies = movies;
    }

    protected Genre(){
    }


    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public Director getDirector() {
        return director;
    }

    public Collection<Movie> getMovies() {
        return movies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return Objects.equals(name, genre.name) &&
                Objects.equals(id, genre.id) &&
                Objects.equals(director, genre.director);
}

    @Override
    public int hashCode() {
        return Objects.hash(name, id, director);
    }

    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", director=" + director +
                '}';
    }
}
