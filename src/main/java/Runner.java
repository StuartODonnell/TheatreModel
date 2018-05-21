import theatre.db.DBHelper;
import theatre.models.Actor;
import theatre.models.Author;
import theatre.models.Play;
import theatre.models.Cast;

import java.util.List;
//import theatre.models.Venue;






public class Runner {

    public static void main(String[] args) {

//        Author author1 = new Author("Zinnie Harris");
//        Author author2 = new Author("Johnny McKnight");
//        DBHelper.save(author1);
//        DBHelper.save(author2);
        Actor actor1 = new Actor("Emma Thomson", 200.00);
        Actor actor2 = new Actor("Claire Foy", 250.00);
        Actor actor3 = new Actor("Nicola Walker", 300.00);
        Actor actor4 = new Actor("Olivia Colman", 350.00);
        Actor actor5 = new Actor("Patrick Swayze", 400.00);
        DBHelper.save(actor1);
        DBHelper.save(actor2);
        DBHelper.save(actor3);
        DBHelper.save(actor4);
        DBHelper.save(actor5);
//        models.Venue venue1 = new models.Venue("The Young Vic", 2000);
//        models.Venue venue2 = new models.Venue("The Citz", 800);
//        DBHelper.save(venue1);
//        DBHelper.save(venue2);
//        Play play1 = new Play("Further than the Furthest Thing",50.00, 20, author1, venue1);
//        Play play2 = new Play("Oresteia: This Restless House", 25.00, 15, author1, venue1);
//        Play play3 = new Play("The Wheel", 35.00, 45, author1, venue1);
//        Play play4 = new Play("The Incredible Adventures of See Thru Sam", 125.00, 5, author2, venue2);
//        Play play5 = new Play("Smalltown", 45.00, 50, author1, venue1);
//        DBHelper.save(play1);
//        DBHelper.save(play2);
//        DBHelper.save(play3);
//        DBHelper.save(play4);
//        DBHelper.save(play5);

//        List<Cast> cast = DBHelper.getAll(Cast.class);
        List<Actor> actors  = DBHelper.getAll(Actor.class);




    }
}
