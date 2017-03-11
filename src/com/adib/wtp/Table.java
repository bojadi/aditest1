package com.adib.wtp;

import java.util.List;

/**
 * Created by adrian.bojani on 3/11/2017.
 */
public class Table {
    private String name;
    private int capacity;
    private List<People> persons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<People> getPersons() {
        return persons;
    }

    public void setPersons(List<People> persons) {
        this.persons = persons;
    }
}
