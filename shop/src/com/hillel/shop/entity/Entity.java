package com.hillel.shop.entity;

public abstract class Entity {

    public static final String ID = "id";
    
    private int id;

    public Entity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
