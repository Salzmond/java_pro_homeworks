package org.telran.lessons.com.homeworkthree;

import org.telran.lessons.com.homeworkthree.Watch;

public class AppleWatch extends Watch {

    public AppleWatch(String brandOfWatch) {
        super(brandOfWatch);
    }

    @Override
    public void whatTimeIsIt(String timeOnWatch) {
        System.out.println("AppleWatch shows " + timeOnWatch + " o'clock");
    }

    @Override
    public String toString() {
        return "AppleWatch{" +
                "brandOfWatch='" + getBrandOfWatch() + '\'' +
                '}';
    }
}
