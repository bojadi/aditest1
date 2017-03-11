package com.adib.wtp.view;

import com.adib.wtp.Person;

import javax.swing.*;

/**
 * Created by adrian.bojani on 3/11/2017.
 */
public class PersonView extends JFrame {
    private Person person;
    public PersonView(){
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
