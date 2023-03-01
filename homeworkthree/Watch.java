package org.telran.lessons.com.homeworkthree;

public abstract class Watch extends Device {

    private final String brandOfWatch;

    @Override
    public boolean itWorks() {
        if(Watch.getMethods())
            System.out.println();
        return true;
    }

    private static boolean getMethods() {
        return false;
    }

    public Watch(String brandOfWatch) {
        this.brandOfWatch = brandOfWatch;
    }

    protected String getBrandOfWatch() {
        return brandOfWatch;
    }

    public abstract void whatTimeIsIt(String timeOnWatch);

}
