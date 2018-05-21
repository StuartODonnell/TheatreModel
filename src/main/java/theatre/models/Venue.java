package models;

import theatre.models.Cast;
import theatre.models.Play;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "venues")

public class Venue {

    private int id;
    private String name;
    private int audience;
    private List<Play> plays;

    public Venue() {
    }

    public Venue(String name, int audience) {
        this.name = name;
        this.audience = audience;
        this.plays = plays;
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
    @Column(name = "theatre_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "audience")
    public int getAudience() {
        return audience;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }

    //    public double boxOfficeTakings(Cast cast){
//        return (this.audience * cast.getCastDayRate());
//    }
//
//    public double getBoxOfficeProfit(Venue venue, Cast cast, Play play) {
//        return (venue.boxOfficeTakings(cast) - play.getPerformanceCost(play, cast));
//    }
//
    @OneToMany(mappedBy = "venue")
    public List<Play> getPlays() {
        return plays;
    }

    public void setPlays(List<Play> plays) {
        this.plays = plays;
    }
}
