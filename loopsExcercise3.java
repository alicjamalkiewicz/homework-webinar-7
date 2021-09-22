package pl.test.forLoop;

import java.util.Scanner;

public class loopsExcercise3 {
    public static void main(String[] args) {

        //3. Napisz program, który wypisuje “Hello World” dopóki użytkownik podaje liczby większe od 0.

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number smaller than 10.");
        int providedNumber = scanner.nextInt();

        /*
        if (providedNumber < 10) {
            System.out.println("Hello World");
        } else {
            System.out.println("Provided number is bigger or equals 10");
        }

         */

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please provide a number smaller than 10.");
            int providedNumber = scanner.nextInt();

            if (providedNumber < 10) {
                System.out.println("hello world");

            } else {
                System.out.println("Incorrect number provided");
            }
        }
    }
}
