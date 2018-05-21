package theatre.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "casts")
public class Cast {

    private int id;
    private Play play;
    private Set<Actor> cast;
    private double castDayRate;

    public Cast() {
    }

    public Cast(Play play) {
        this.id = id;
        this.play = play;
        this.cast = cast;
        this.castDayRate = castDayRate;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//    @Column(name = "play")
//    public Play getPlay() {
//        return play;
//    }
//
//    public void setPlay(Play play) {
//        this.play = play;
//    }
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

    public void setCastDayRate(){
        this.castDayRate = castDayRate;
    }

    public void addActorToCast(Actor actor){
        this.cast.add(actor);
    }

    public int countActorsInCast() {
        return this.cast.size();
    }
}
