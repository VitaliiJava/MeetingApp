package com.learn.metingapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalik on 09.09.2016.
 */
public class Test {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dredd", 33, "London", 0, "male"));
        list.add(new Person("Lilu", 25, "Madrid", 0, "female"));
        list.add(new Person("Breatny", 27, "Marselle", 1, "female"));
        list.add(new Person("Liza", 21, "Kuiv", 2, "female"));
        String sexOfPerson = null;
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.println(sexOfPerson=list.get(i).getSex());
            }
        }
    }
}
