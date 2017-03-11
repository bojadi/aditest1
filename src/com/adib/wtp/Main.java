package com.adib.wtp;

import com.adib.wtp.view.PeopleView;

/**
 * Created by adrian.bojani on 3/11/2017.
 */
public class Main {
    public static void showPeoples(){
        System.out.println("show People");
        PeopleView peopleView=new PeopleView();
        peopleView.setTitle("People view");
        peopleView.setSize(400,400);
        peopleView.show();
    }
    public  static void main(String[] args){
        System.out.println("Hello world");
        showPeoples();
    }

}
