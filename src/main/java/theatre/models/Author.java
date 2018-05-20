package theatre.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {

    private int id;
    private String name;
    private List<Play> plays;

    public Author() {
    }

    public Author(String name, List<Play> plays) {
        this.id = id;
        this.name = name;
        this.plays = plays;
    }
@Id
@GeneratedValue
@Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "author_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "author")
    public List<Play> getPlays() {
        return plays;
    }

    public void setPlays(List<Play> plays) {
        this.plays = plays;
    }
}
