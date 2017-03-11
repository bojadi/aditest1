package com.adib.wtp;

/**
 * Created by adrian.bojani on 3/11/2017.
 */
public class Main {
    public void showPersons(){
        System.out.println("show Persons");
        PeopleView peopleView=new PeopleView();
        peopleView.setTitle("People view");
        peopleView.setSize(400,400);
        peopleView.show();
    }
    public  static void main(String[] args){
        System.out.println("Hello world");
    }

}
