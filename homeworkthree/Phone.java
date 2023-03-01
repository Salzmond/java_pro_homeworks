package org.telran.lessons.com.homeworkthree;

import java.lang.reflect.Method;

public abstract class Phone extends Device{

    private final String name;

    @Override
    public boolean itWorks() {
        if(Phone.getMethods())
            System.out.println();
            return true;
    }

    private static boolean getMethods() {
        return false;
    }

    public Phone(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public abstract void call(int number);

    public abstract void receiveCall(int number);

}
