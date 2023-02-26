package org.telran.lessons.com.homeworktwo;

public class MobilePhone extends Phone{
    private int number;
    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void call(int number, int numberMakeCall) {
        this.number = number;
        System.out.println("MobilePhone of Mom " + number + " call to " + numberMakeCall);
    }

    @Override
    public void receiveCall(int number, int numberReceiveCall) {
        this.number = number;
        System.out.println("MobilePhone of Mom " + number + " receive call from " + numberReceiveCall);
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                " number ="  + this.number +
                '}';
    }
}


