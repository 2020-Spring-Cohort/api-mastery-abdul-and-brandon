import com.fasterxml.jackson.annotation.JsonIgnore;
import org.wcci.apimastery.Entities.Genre;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Movie {
    @Id
    @GeneratedValue

    private Long id;
    private String title;
    private String duration;

    @JsonIgnore
    @ManyToOne
    private Genre genre;

    protected Movie() {}

    public Movie(String title, String duration, Genre genre) {
        this.title=title;
        this.duration=duration;
        this.genre=genre;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public Genre getGenre() {return genre;}
}