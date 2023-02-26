package org.telran.lessons.com.homeworktwo;

public abstract class Phone{

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public void call(int number, int numberMakeCall) {

        System.out.println(number + "call to " + numberMakeCall);
    }

    public void receiveCall(int number, int numberReceiveCall) {
        System.out.println(number + "receive call from " + numberReceiveCall);
    }
}
