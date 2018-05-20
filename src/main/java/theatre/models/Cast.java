package theatre.models;

import java.util.Set;

public class Cast {

    private int id;
    private int play_id;
    private int actor_id;
    private Set<Actor> cast;

    public Cast() {
    }

    public Cast(int play_id, int actor_id) {
        this.play_id = play_id;
        this.actor_id = actor_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlay_id() {
        return play_id;
    }

    public void setPlay_id(int play_id) {
        this.play_id = play_id;
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public Set<Actor> getCast() {
        return cast;
    }

    public void setCast(Set<Actor> cast) {
        this.cast = cast;
    }
}
