package theatre.models;


import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "plays")
public class Play {

    private int id;
    private String name;
    private List<Cast> cast;
    private double ticketPrice;
    private int numberOfPerformances;
    private Author author;
    private models.Venue venue;


    public Play() {
    }

    public Play(String name, double ticketPrice, int numberOfPerformances, Author author, models.Venue venue) {
        this.name = name;
        this.cast = cast;
        this.ticketPrice = ticketPrice;
        this.numberOfPerformances = numberOfPerformances;
        this.author = author;
        this.venue = venue;
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
    @Column(name = "play_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "cast_list")
    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }
    @Column(name = "ticket_price")
    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Column(name = "number_of_performances")
    public int getNumberOfPerformances() {
        return numberOfPerformances;
    }

    public void setNumberOfPerformances(int numberOfPerformances) {
        this.numberOfPerformances = numberOfPerformances;
    }
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    @ManyToOne
    @JoinColumn(name = "venue_id", nullable = false)
    public models.Venue getVenue() {
        return venue;
    }

    public void setVenue(models.Venue venue) {
        this.venue = venue;
    }

//        public double getPerformanceCost(Play play, Cast cast) {
//        return (play.numberOfPerformances() * cast.getCastDayRate());
//    }

//    ---------------FORMULA FOR TAKINGS----------------
//    (play.ticketPrice() * venue.audience()) - (cast.getCastDayRate() * play.numberOfPerformances())
//


}
