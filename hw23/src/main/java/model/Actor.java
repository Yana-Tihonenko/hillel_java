package model;

import java.util.Date;

public class Actor {
    private int id;
    private String fioActor;
    private Date birthDateActor;

    public Actor(int id, String fioActor, Date birthDateActor) {
        this.id = id;
        this.fioActor = fioActor;
        this.birthDateActor = birthDateActor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFioActor() {
        return fioActor;
    }

    public void setFioActor(String fioActor) {
        this.fioActor = fioActor;
    }

    public Date getBirthDateActor() {
        return birthDateActor;
    }

    public void setBirthDateActor(Date birthDateActor) {
        this.birthDateActor = birthDateActor;
    }

    @Override
    public String toString() {
        return  fioActor + birthDateActor;
    }
}
