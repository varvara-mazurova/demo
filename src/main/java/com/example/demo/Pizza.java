package com.example.demo;

/*import jdk.jfr.Enabled;*/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pizza {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int size;

    public Pizza(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public Pizza() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
