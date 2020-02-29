package service;

import videolibrary.Actor;
import videolibrary.Film;
import videolibrary.Producer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static service.ExecuteQueryAndReturnResul.UpdateQueryToParametr;
import static service.ExecuteQueryAndReturnResul.executeQueryToParametr;
import static service.ExecuteQueryAndReturnResul.executeQueryWithoutParametr;

public class DBManager {
    private static final String FILMS_REREASE_LAST_YAES = "" +
            "SELECT * FROM films a where YEAR(a.date_released)  between YEAR(now())-2 and YEAR(now())-1";

    private static final String ALL_ACTORS_OF_FILM =
            "select a.id_actor, a.fio_actor, a.date_birth_actor from actor a join film_actor b on a.id_actor=b.id_actor where b.id_film=?";

    private static final String ALL_ACTOR_TO_BE_FILM_MORE_COUNT = "SELECT  a.id_actor, a.fio_actor, a.date_birth_actor FROM actor a " +
            "join (SELECT c.id_actor, COUNT(id_film) FROM film_actor c GROUP BY c.id_actor HAVING COUNT(c.id_film) >= ?) b  ON  a.id_actor=b.id_actor";

    private static final String ACTOR_TO_BE_PRODECER = "SELECT  a.id_actor, a.fio_actor, a.date_birth_actor FROM actor a join (SELECT c.id_producer FROM films c GROUP BY  c.id_producer ) b  ON  a.id_actor=b.id_producer";

    private static final String PRODECER_TO_FILM = "select a.id_actor, a.fio_actor, a.date_birth_actor from actor a " +
            "join films b on a.id_actor=b.id_producer where b.id_film=?";

    private static final String DELETE_FILM_FROM_YAES = "DELETE FROM films a where year(a.date_released)< year(now())-?";


    public static List<Film> filmOneTwoReleaseLate() {
        List<Film> filmOneTwoReleaseLate = new ArrayList<Film>();
        List<Actor> listactorToFilm;
        Producer producer;
        ResultSet resultSqlFilm = null;
        try {
            resultSqlFilm = executeQueryWithoutParametr(FILMS_REREASE_LAST_YAES);
            if (resultSqlFilm != null) {
                filmOneTwoReleaseLate = new ArrayList<Film>();
                while (resultSqlFilm.next()) {
                    int idFilm = resultSqlFilm.getInt("ID_FILM");
                    String nameFilm = resultSqlFilm.getString("name_film");
                    Date dateRelease = resultSqlFilm.getDate("date_released");
                    listactorToFilm = actorToFilm(idFilm);
                    producer = producerToFilms(idFilm);
                    filmOneTwoReleaseLate.add(new Film(idFilm, nameFilm, listactorToFilm, producer, dateRelease));
                    return filmOneTwoReleaseLate;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filmOneTwoReleaseLate;
    }

    public static Producer producerToFilms(int idFilm) {
        ResultSet resultSet = null;
        Producer producerToFilms = null;
        resultSet = executeQueryToParametr(PRODECER_TO_FILM, idFilm);
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    int idActor = resultSet.getInt("id_actor");
                    String fioActor = resultSet.getString("fio_actor");
                    Date birthDateActor = resultSet.getDate("date_birth_actor");
                    producerToFilms = new Producer(idActor, fioActor, birthDateActor);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return producerToFilms;
    }

    public static List<Actor> actorToFilm(int idFilm) {
        ResultSet resultSet = null;
        List<Actor> allActorToFilm = new ArrayList<Actor>();
        resultSet = executeQueryToParametr(ALL_ACTORS_OF_FILM, idFilm);
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    int idActor = resultSet.getInt("id_actor");
                    String fioActor = resultSet.getString("fio_actor");
                    Date birthDateActor = resultSet.getDate("date_birth_actor");
                    allActorToFilm.add(new Actor(idActor, fioActor, birthDateActor));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return allActorToFilm;
    }

    public static List<Actor> actorMoreCountNToFilms(int count) {
        ResultSet resultSet = null;
        List<Actor> actorMoreCountNToFilms = new ArrayList<Actor>();
        resultSet = executeQueryToParametr(ALL_ACTOR_TO_BE_FILM_MORE_COUNT, count);
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    int idActor = resultSet.getInt("id_actor");
                    String fioActor = resultSet.getString("fio_actor");
                    Date birthDateActor = resultSet.getDate("date_birth_actor");
                    actorMoreCountNToFilms.add(new Actor(idActor, fioActor, birthDateActor));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return actorMoreCountNToFilms;
    }


    public static List<Actor> actorToBeProducer() {
        ResultSet resultSet = null;
        List<Actor> actorToBeProducer = new ArrayList<Actor>();
        resultSet = executeQueryWithoutParametr(ACTOR_TO_BE_PRODECER);
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    int idActor = resultSet.getInt("id_actor");
                    String fioActor = resultSet.getString("fio_actor");
                    Date birthDateActor = resultSet.getDate("date_birth_actor");
                    actorToBeProducer.add(new Actor(idActor, fioActor, birthDateActor));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return actorToBeProducer;
    }

    public static boolean deleteFilmToYear(int year) {
        int resultSet = UpdateQueryToParametr(DELETE_FILM_FROM_YAES, year);
        if (resultSet > 0) {
            return true;
        }
        return false;
    }
}
