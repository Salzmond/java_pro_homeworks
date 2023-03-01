package org.telran.lessons.com.homeworkthree;

public class WallClock extends Watch {

    public WallClock(String brandOfWatch) {
        super(brandOfWatch);
    }

    @Override
    public void whatTimeIsIt(String timeOnWatch) {
        System.out.println("WallClock shows " + timeOnWatch + " o'clock");
    }

    @Override
    public String toString() {
        return "WallClock{" +
                "brandOfWatch='" + getBrandOfWatch() + '\'' +
                '}';
    }
}
