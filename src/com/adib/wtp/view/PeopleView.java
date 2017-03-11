package com.adib.wtp.view;

import com.adib.wtp.People;

import javax.swing.*;

/**
 * Created by adrian.bojani on 3/11/2017.
 */
public class PeopleView extends JFrame {
    private People people;
    public PeopleView(){
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
