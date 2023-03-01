package org.telran.lessons.com.homeworkthree;

public class ButtonPhone extends Phone {
    public ButtonPhone(String phoneName) {
        super(phoneName);
    }

    @Override
    public void call(int number) {
        System.out.println("ButtonPhone with name " + getName() + " call to " + number);
    }

    @Override
    public void receiveCall(int number) {
        System.out.println("ButtonPhone with name " + getName() + " receive call from " + number);
    }

    @Override
    public String toString() {
        return "ButtonPhone {" +
                "phoneNumber='" + getName() + '\'' +
                '}';
    }
}