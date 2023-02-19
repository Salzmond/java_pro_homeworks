package org.telran.lessons.com.homeworkone;

public class Phone {

    private int number;

    private int weight;

    private String model;

    public void setField(int number, int weight, String model) {
        this.number = number;
        this.weight = weight;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone {" +
                "number is " + number +
                ", weight is " + weight +
                ", model is " + model +
                '}';
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public int getNumber() {
        System.out.println("number is " + number);
        return number;
    }
}

