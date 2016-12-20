package com.learn.metingapp;
/**
 * The class is created for storing information about person.
 */
public class Person {

    private String nickName;
    private int age;
    private String city;
    private int countOfChildren;
    private String sex;

    public Person(String nickName, int age, String city, int countOfChildren, String sex) {
        this.nickName = nickName;
        this.age = age;
        this.city = city;
        this.countOfChildren = countOfChildren;
        this.sex = sex;
    }
    
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 65 || age < 16 || age < 0) {
            System.out.println("Input correct age from 16 to 65");
        }
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountOfChildren() {
        return countOfChildren;
    }

    public void setCountOfChildren(int countOfChildren) {
        if (countOfChildren > 20 || countOfChildren < 0) {
            System.out.println("Input correct countOfChildren from 0 to 20");
        }
        this.countOfChildren = countOfChildren;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", countOfChildren=" + countOfChildren +
                ", sex='" + sex + '\'' +
                "}\n";
    }
}
