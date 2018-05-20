package theatre.models;


import javax.persistence.*;

@Entity
@Table(name="actors")
public class Actor {

    private int id;
    private String name;
    private int cast_id;
    private double salary;
//    private boolean availability;

    public Actor() {
    }

    public Actor(String name, double salary, int cast_id) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.cast_id = cast_id;

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
    @Column(name ="salary")
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @ManyToOne()
    @JoinColumn(name = "cast_id", nullable = false)
    public int getCast_id() {
        return cast_id;
    }

    public void setCast_id(int cast_id) {
        this.cast_id = cast_id;
    }
}
