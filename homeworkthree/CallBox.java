package org.telran.lessons.com.homeworkthree;

public class CallBox extends Phone {
    public CallBox(String phoneName) {
        super(phoneName);
    }

    @Override
    public void call(int number) {
        System.out.println("CallBox with name "  + getName() + " call to " + number);
    }

    @Override
    public void receiveCall(int number) {
        System.out.println("CallBox with name " + getName() + " receive call from " + number);
    }

    @Override
    public String toString() {
        return "CallBox{" +
                "phoneNumber='" + getName() + '\'' +
                '}';
    }
}