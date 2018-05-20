package theatre.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "casts")
public class Cast {

    private int id;
    private Play play;
    private Set<Actor> cast;

    public Cast() {
    }

    public Cast(Play play) {
        this.play = play;
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
    @Column(name = "play")
    public Play getPlay() {
        return play;
    }

    public void setPlay(Play play) {
        this.play = play;
    }
    @OneToMany(mappedBy = "cast")
    public Set<Actor> getCast() {
        return cast;
    }

    public void setCast(Set<Actor> cast) {
        this.cast = cast;
    }
    @Column (name = "cast_day_rate")
    public double getCastDayRate(){
        double castDayRate = 0;
        for (Actor cast : cast){
            castDayRate += cast.getDayRate();
        }

        return castDayRate;
    }
}
