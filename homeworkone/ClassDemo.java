package org.telran.lessons.com.homeworkone;

public class ClassDemo {
    public static void main(String[] args) {


        Person personOne = new Person();
        Person personTwo = new Person("Aleksey Tupolev", 25);

        personTwo.talk();
        personTwo.move();
        System.out.println();

        Phone phoneOne = new Phone();
        Phone phoneTwo = new Phone();
        Phone phoneThree = new Phone();

        phoneOne.setField(2525, 98, "Samsung");
        phoneTwo.setField(3425,115, "iPhone");
        phoneThree.setField(8978, 67, "Huawei");

        phoneOne.receiveCall("Makron");
        phoneTwo.receiveCall("Scholz");
        phoneThree.receiveCall("Biden");
        System.out.println();

        phoneOne.getNumber();
        System.out.println();

        System.out.println(phoneOne);
        System.out.println(phoneTwo);
        System.out.println(phoneThree);

    }
}
