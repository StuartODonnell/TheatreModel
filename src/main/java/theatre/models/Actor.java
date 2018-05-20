package theatre.models;


import javax.persistence.*;

@Entity
@Table(name="actors")
public class Actor {

    private int id;
    private String name;
    private double dayRate;
    private Cast cast;

//    private boolean availability;

    public Actor() {
    }

    public Actor(String name, double dayRate) {
        this.id = id;
        this.name = name;
        this.dayRate = dayRate;


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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name ="day_rate")
    public double getDayRate() {
        return dayRate;
    }

    public void setSalary(double dayRate) {
        this.dayRate = dayRate;
    }

    @ManyToOne()
    @JoinColumn(name = "cast_id", nullable = false)
    public Cast getCast() {
        return cast;
    }

    public void setCast(Cast cast) {
        this.cast = cast;
    }

}
