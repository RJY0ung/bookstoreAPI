package com.api.bookstore.entity;

import javax.persistence.*;
import java.util.ArrayList;

//@Entity
//@Table(name = "author")
public class Author {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String birthday;


    public Author(int id, String name, String birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}


