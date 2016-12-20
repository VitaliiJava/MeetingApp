package com.learn.metingapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * The class is created for storing and handle of information about person.
 */
public class Meeting {
    private static final Scanner scanner = new Scanner(System.in);
    /**
     * The method allows to show information about person.
     */

    public void showPerson() {
        System.out.println("Input nick name of person which you want to see(nick name is unique).");
        String nickName = scanner.nextLine();
        List<Person> list = getListOfPerson();
        Iterator<Person> iter = list.iterator();
        while (iter.hasNext()) {
            Person person = iter.next();
            if (person.getNickName().equalsIgnoreCase(nickName)) {
                System.out.println("︻デ┳═ー-------");
                System.out.println("……………………………………..︵.︵");
                System.out.println("…………………………………….(˛. *˛)……..^v^");
                System.out.println("………………………………….(˛˛. *。 )");
                System.out.println("………………_Π_____….(˛* ˛*˛* )");
                System.out.println("……………./______/~＼…..|.|");
                System.out.println("╬╬╬╬╬˛°.｜田田 ｜門｜╬╬╬╬╬–╬╬╬╬╬–╬╬╬╬╬");
                System.out.println("▁ ▂ ▃ ▄ ▅ ☆ ░░░░░░░░░░░░░░░░░░░░░░░░ ▅ ▄ ▃ ▂");
                System.out.println("-> Nick name " + person.getNickName());
                System.out.println("-> Age " + person.getAge());
                System.out.println("-> City " + person.getCity());
                System.out.println("-> Count Of Children " + person.getCountOfChildren());
                System.out.println("-> Sex " + person.getSex());
                System.out.println("︻デ┳═ー-------");
            }
        }
    }
    /**
     * The method allows to show information about persons.
     */

    public void showListRegistrationPerson() {
        List<Person> list = getListOfPerson();
        String sexOfPerson = null;
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sexOfPerson = list.get(i).getSex();
            }
        }
        Iterator<Person> iter = list.iterator();
        while (iter.hasNext()) {
            Person person = iter.next();
            if (!person.getSex().equals(sexOfPerson)) {
                System.out.println(person);
            }
        }

    }
    /**
     * The method allows to see the menu.
     */

    public void menu() {
        System.out.println("1) Registration.\n2) Show persons.\n3) Find anket.\n4) Search people by full options.\n5) Search people by age.\n6) Exit");
    }
    /**
     * The method allows to get list of persons.
     *
     * * @return list of persons.
     */

    public List<Person> getListOfPerson() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dredd", 33, "London", 0, "male"));
        list.add(new Person("Lilu", 25, "Madrid", 0, "female"));
        list.add(new Person("Breatny", 27, "Marselle", 1, "female"));
        list.add(new Person("Liza", 21, "Kuiv", 2, "female"));
        list.add(new Person("Rosel", 43, "Paris", 3, "male"));
        list.add(new Person("Paul", 23, "London", 0, "male"));
        list.add(new Person("Eddy", 25, "Madrid", 1, "male"));
        list.add(new Person("Anna", 37, "Marselle", 3, "female"));
        list.add(new Person("Doctor", 35, "Madrid", 3, "male"));
        list.add(new Person("Lily", 39, "London", 3, "female"));
        list.add(new Person("Orel", 25, "Paris", 2, "male"));
        return list;
    }
    /**
     * The method allows you to register.
     */
    public void registration() {
        System.out.println("Hello,you are wellcome! \n-----------------------------------------------------------Input your nick name.");
        String nickName = scanner.next();
        System.out.println("Input your age. ");
        int age = scanner.nextInt();
        System.out.println("Input your city.");
        String city = scanner.next();
        System.out.println("Input your count of children.");
        int countOfChildren = scanner.nextInt();
        System.out.println("Input your sex(male,female).");
        String sex = scanner.next();
        String unique = null;
        List<Person> list = getListOfPerson();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).getNickName().equals(nickName)) {
                unique = nickName;
            }
        }
//        list.get(list.size() - 1).getNickName();
        list.add(new Person(unique, age, city, countOfChildren, sex));
        System.out.println("Registration compleate, thank you!");
        Iterator<Person> iter = list.iterator();
        while (iter.hasNext()) {
            Person person = iter.next();
            if (!person.getSex().equals(sex)) {
                if (person.getAge() - 5 <= age && person.getAge() != age + 3) {
                    System.out.println(person);
                }
            }
        }
    }
    /**
     * The method allows to search person by full options.
     */
    public void searchPersonForFullData() {
        System.out.println(" \n-----------------------------------------------------------\nInput nick name.");
        String nickName = scanner.next();
        System.out.println("Input age. ");
        int age = scanner.nextInt();
        System.out.println("Input city.");
        String city = scanner.next();
        System.out.println("Input count of children.");
        int countOfChildren = scanner.nextInt();
        System.out.println("Input sex(male,female).");
        String sex = scanner.next();
        List<Person> list = getListOfPerson();
        Iterator<Person> iter = list.iterator();
        while (iter.hasNext()) {
            Person person = iter.next();
            if (person.getNickName().equals(nickName) && person.getAge() == age && person.getCity().equals(city) && person.getCountOfChildren() == countOfChildren && person.getSex().equals(sex)) {
                System.out.println(person);
            }
        }
    }
    /**
     * The method allows to search person by age.
     */
    public void searchPersonByAge() {
        System.out.println(" \n-----------------------------------------------------------\nInput age of person.");
        int age = scanner.nextInt();
        List<Person> list = getListOfPerson();
        Iterator<Person> iter = list.iterator();
        while (iter.hasNext()) {
            Person person = iter.next();
            if (person.getAge() == age) {
                System.out.println(person);
            }
        }
    }
}

