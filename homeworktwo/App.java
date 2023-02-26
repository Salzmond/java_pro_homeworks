package org.telran.lessons.com.homeworktwo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfPhone = scanner.nextInt();
        int numberForMakeCall = scanner.nextInt();
        int numberForReceiveCall = scanner.nextInt();

        Phone mobile = new MobilePhone();
        Phone button = new ButtonPhone();
        Phone callBox = new CallBox();

        mobile.setNumber(numberOfPhone);
        System.out.println(mobile);
        mobile.call(numberOfPhone, numberForMakeCall);
        mobile.receiveCall(numberOfPhone, numberForReceiveCall);
        System.out.println();

        button.setNumber(numberOfPhone);
        System.out.println(button);
        button.call(numberOfPhone, numberForMakeCall);
        button.receiveCall(numberOfPhone, numberForReceiveCall);
        System.out.println();

        callBox.setNumber(numberOfPhone);
        System.out.println(callBox);
        callBox.call(numberOfPhone, numberForMakeCall);
        callBox.receiveCall(numberOfPhone, numberForReceiveCall);

        Phone[] phones = {new MobilePhone(), new ButtonPhone(), new CallBox()};

        for (Phone phone : phones) {
            phone.call(numberOfPhone, numberForMakeCall);
            phone.receiveCall(numberOfPhone, numberForReceiveCall);
        }

        for (Phone phone : phones) {

            makeCall(phone, numberForMakeCall);
            receiveCalls(phone, numberForReceiveCall);
        }
    }


    public static void makeCall(Phone phone, int numberForMakeCall) {
        System.out.println(phone + " call to " + numberForMakeCall);
    }

    public static void receiveCalls(Phone phone, int numberForReceiveCall) {
        System.out.println(phone + " receive call from " + numberForReceiveCall);
    }
}
