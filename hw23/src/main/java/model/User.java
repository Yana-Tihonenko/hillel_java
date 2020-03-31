package model;

public class User {
    public static final String NAME = "name";
    public static final String PASSWORD = "password";
    public static final String FIRSTNAME = "firstname";
    public static final String ROLE = "role";

    private int id;
    private String name;
    private String password;
    private String firstName;


    public User(int id, String name, String password, String firstName) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.firstName = firstName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



}
