package model;

import java.util.Date;
import java.util.List;

public class Film {
    int idFilm;
    String nameFilm;
    List<Actor> actorsToFilm;
    Producer producertoFilm;
    Date releaseFilm;
    String country;

    public Film(int idFilm, String nameFilm, List<Actor> actorsToFilm, Producer producertoFilm, Date releaseFilm) {
        this.idFilm = idFilm;
        this.nameFilm = nameFilm;
        this.actorsToFilm = actorsToFilm;
        this.producertoFilm = producertoFilm;
        this.releaseFilm = releaseFilm;
    }


    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public List<Actor> getActorsToFilm() {
        return actorsToFilm;
    }

    public void setActorsToFilm(List<Actor> actorsToFilm) {
        this.actorsToFilm = actorsToFilm;
    }

    public Producer getProducertoFilm() {
        return producertoFilm;
    }

    public void setProducertoFilm(Producer producertoFilm) {
        this.producertoFilm = producertoFilm;
    }

    public Date getReleaseFilm() {
        return releaseFilm;
    }

    public void setReleaseFilm(Date releaseFilm) {
        this.releaseFilm = releaseFilm;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return
                nameFilm + actorsToFilm + producertoFilm + releaseFilm ;
    }
}

