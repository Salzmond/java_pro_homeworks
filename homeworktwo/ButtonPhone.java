package org.telran.lessons.com.homeworktwo;

public class ButtonPhone extends Phone{

    private int number;
    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void call(int number, int numberMakeCall) {
        this.number = number;
        System.out.println("ButtonPhone of Grandma " + number + " call to " + numberMakeCall);
    }

    @Override
    public void receiveCall(int number, int numberReceiveCall) {
        this.number = number;
        System.out.println("ButtonPhone of Grandma " + number + " receive call from " + numberReceiveCall);
    }

    @Override
    public String toString() {
        return "ButtonPhone{" +
                " number = " + number +
                '}';
    }
}
