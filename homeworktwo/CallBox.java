package org.telran.lessons.com.homeworktwo;

public class CallBox extends Phone{

    private int number;
    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void call(int number, int numberMakeCall) {
        this.number = number;
        System.out.println("CallBox of Dad " + number + " call to " + numberMakeCall);
    }

    @Override
    public void receiveCall(int number, int numberReceiveCall) {
        this.number = number;
        System.out.println("CallBox of Dad " + number + " call to " + numberReceiveCall);
    }

    @Override
    public String toString() {
        return "CallBox{" +
                " number = " + number +
                '}';
    }
}
