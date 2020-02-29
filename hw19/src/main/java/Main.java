import service.DBManager;
import videolibrary.Actor;
import videolibrary.Film;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //task1
        System.out.println("task1");
        List<Film> film = DBManager.filmOneTwoReleaseLate();
        for (Film obj : film) {
            System.out.println(obj.toString());
        }
        //task2
        System.out.println("task2");
        List<Actor> actors = DBManager.actorToFilm(6);
        for (Actor obj : actors) {
            System.out.println(obj.toString());
        }
        //task3
        System.out.println("task3");
        actors = DBManager.actorMoreCountNToFilms(1);
        for (Actor obj : actors) {
            System.out.println(obj.toString());
        }
        //task4
        System.out.println("task4");
        actors = DBManager.actorToBeProducer();
        for (Actor obj : actors) {
            System.out.println(obj.toString());
        }
        //task5
        /*System.out.println("task5");
        System.out.println (DBManager.deleteFilmToYear(25));*/
    }
}
