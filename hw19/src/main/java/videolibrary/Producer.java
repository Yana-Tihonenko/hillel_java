package videolibrary;

import java.util.Date;

public class Producer {
    private int id;
    private String fioProducer;
    private Date birthDateProducer;

    public Producer(int id, String fioProducer, Date birthDateProducer) {
        this.id = id;
        this.fioProducer = fioProducer;
        this.birthDateProducer = birthDateProducer;
    }

    public Producer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFioProducer() {
        return fioProducer;
    }

    public void setFioProducer(String fioProducer) {
        this.fioProducer = fioProducer;
    }

    public Date getBirthDateProducer() {
        return birthDateProducer;
    }

    public void setBirthDateProducer(Date birthDateProducer) {
        this.birthDateProducer = birthDateProducer;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "fioProducer='" + fioProducer + '\'' +
                ", birthDateProducer=" + birthDateProducer +
                '}';
    }
}
