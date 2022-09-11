package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        setArrayElements();
        sortArrayElements();
    }

    public static void accessSmartHome() {
        Scanner scanner = new Scanner(System.in);
        final int password = 1234;
        System.out.print("Enter the password:  ");
        int checkPass = scanner.nextInt();
        if (checkPass == password) {
            chooseAction();
        } else {
            System.out.println("Incorrect password!");
        }
    }

    public static void chooseAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the object: 1 – speakers, 2 – lamp, 3 – door, 4 - kettle");
        int action = scanner.nextInt();

        switch (action) {
            case 1:
                controlMusic();
                break;
            case 2:
                controlLight();
                break;
            case 3:
                controlDoor();
                break;
            case 4:
                controlKettle();
                break;
        }
    }

    public static void controlMusic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("on/off");
        String tumbler = scanner.next();

        if (tumbler.equals("on")) {
            System.out.println("The music is on");
        } else if (tumbler.equals("off")) {
            System.out.println("The music is off");
        } else {
            System.out.println("Invalid operation");
        }
    }

    public static void controlLight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("on/off");
        String tumbler = scanner.next();

        if (tumbler.equals("on")) {
            System.out.println("The light is on");
        } else if (tumbler.equals("off")) {
            System.out.println("The light is off");
        } else {
            System.out.println("Invalid operation");
        }
    }

    public static void controlDoor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("open/close");
        String tumbler = scanner.next();

        if (tumbler.equals("on")) {
            System.out.println("The door is opened");
        } else if (tumbler.equals("off")) {
            System.out.println("The door is closed");
        } else {
            System.out.println("Invalid operation");
        }
    }

    public static void controlKettle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("on/off");
        String tumbler = scanner.next();

        if (tumbler.equals("on")) {
            System.out.println("The kettle is on");
        } else if (tumbler.equals("off")) {
            System.out.println("The kettle is off");
        } else {
            System.out.println("Invalid operation");
        }
    }

    public static void setArrayElements() {
        int[] squares = new int[10];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i;
        }
        System.out.println(Arrays.toString(squares));




    }

    public static void sortArrayElements() {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

        }

        System.out.println(Arrays.toString(arr));




    }
}
