package org.telran.lessons.com.homeworkthree;

public class MobilePhone extends Phone {
    public MobilePhone(String phoneName) {
        super(phoneName);
    }

    @Override
    public void call(int number) {
        System.out.println("MobilePhone with name " + getName() + " call to " + number);
    }

    @Override
    public void receiveCall(int number) {
        System.out.println("MobilePhone with name " + getName() + " receive call from " + number);
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "phoneNumber='" + getName() + '\'' +
                '}';
    }
}
