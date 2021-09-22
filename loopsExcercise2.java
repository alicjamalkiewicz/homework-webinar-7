package pl.test.forLoop;

import java.util.Scanner;

public class loopsExcercise2 {
    public static void main(String[] args) {

        /* 2. Napisz aplikację która przyjmuje parametr (ilość powtórzeń) ze scannera,
        a następnie zadaną ilość razy wypisuje na ekran “Hello World” - pętlą for i while
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many times should I proceed?");
        int limit = scanner.nextInt();

        for (int i = 1; i <= limit; i++)
            System.out.println(i + ". Hello World");

    }
}
