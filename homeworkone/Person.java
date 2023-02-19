package org.telran.lessons.com.homeworkone;

public class Person {

    private String fullName;
    private int age;

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("говорит " + fullName);
    }

    public void talk() {
        System.out.println("говорит " + fullName);
    }
}
