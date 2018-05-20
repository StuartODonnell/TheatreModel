package theatre.models;

import java.util.List;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Play> getPlays() {
        return plays;
    }

    public void setPlays(List<Play> plays) {
        this.plays = plays;
    }
}
