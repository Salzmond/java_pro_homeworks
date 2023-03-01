package org.telran.lessons.com.homeworkthree;

import java.text.DecimalFormat;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        ButtonPhone buttonPhone = new ButtonPhone("+2517 35");
        System.out.println(buttonPhone);
        buttonPhone.call(randomNumberForCall());
        buttonPhone.receiveCall(randomNumberForReceiveCall());
        System.out.println();

        CallBox callBox = new CallBox("+354987 589");
        System.out.println(callBox);
        callBox.call(randomNumberForCall());
        callBox.receiveCall(randomNumberForReceiveCall());
        System.out.println();

        MobilePhone mobilePhone = new MobilePhone("+4985695");
        System.out.println(mobilePhone);
        mobilePhone.call(randomNumberForCall());
        mobilePhone.receiveCall(randomNumberForReceiveCall());
        System.out.println();

        Phone[] phones = {buttonPhone, callBox, mobilePhone};

        for (Phone iPhone : phones) {
            iPhone.call(randomNumberForCall());
            iPhone.receiveCall(randomNumberForReceiveCall());
            System.out.println();
        }

        AppleWatch apple = new AppleWatch("Apple");
        System.out.println(apple);
        apple.whatTimeIsIt(timeForWatch());
        System.out.println();

        WallClock citizen = new WallClock("Citizen");
        System.out.println(citizen);
        citizen.whatTimeIsIt(timeForWatch());
        System.out.println();

        Device devices[] = {mobilePhone,callBox,buttonPhone,apple,citizen};
        for(Device gadget : devices) {
            System.out.println(gadget.itWorks());
        }

    }

    public static int randomNumberForCall() {
        Random random = new Random();
        int numberForCall;
        return numberForCall = random.nextInt(999999999);
    }

    public static int randomNumberForReceiveCall() {
        Random random = new Random();
        int numberForReceiveCall;
        return numberForReceiveCall = random.nextInt(999999999);
    }

    public static String timeForWatch() {

        Random random = new Random();
        double time = random.nextDouble(0.05,0.59) + random.nextInt(0,24);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String timeOnWatch = decimalFormat.format(time);
        return timeOnWatch;
    }
}
