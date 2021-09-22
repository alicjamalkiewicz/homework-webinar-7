package pl.test.forLoop;

import javax.sound.midi.Soundbank;

public class loopsExcercise1 {
    public static void main(String[] args) {

        System.out.println("a---------------------");
        printNumbers0100();
        System.out.println("b---------------------");
        printNumbers10001020();
        System.out.println("c---------------------");
        numbersInRangeDividedBy5();
        System.out.println("d---------------------");
        numbersInRangeDividedBy3();
        System.out.println("e---------------------");
        numbersInRangeDividedBy3And5();
        System.out.println("f---------------------");
        evenNumbersInRange300();
        System.out.println("g---------------------");
        evenNumbersInRange100();
        System.out.println("h---------------------");
        printAlphabetSmall();
        System.out.println("i---------------------");
        printAlphabetCapital();
        System.out.println("j---------------------");
        evenLettersCapital();
        System.out.println("k---------------------");
        alphabetFromB();
        System.out.println("l---------------------");
        helloWorldX100();

    }

    //a. liczby z zakresu 1 - 100 w nowych liniach

    public static void printNumbers0100() {
        for (int i = 0; i <= 100; i++)
            System.out.println(i);
    }

    //b. liczby z zakresu 1000 - 1020 w tej samej linii oddzielone przecinkami i spacją
    public static void printNumbers10001020() {
        for (int i = 1000; i <= 1020; i++)
            System.out.print(i + ", ");
    }

    //c. liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach
    public static void numbersInRangeDividedBy5(){
        for (int n = -30; n <= 1000; n++){ // jaki powinien być int n, zeby -30 było wzięte pod uwage???
            if (n % 5 == 0)
                System.out.println(n);
        }
    }
    //d. liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach
    public static void numbersInRangeDividedBy3() {
        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0)
                System.out.println(n);
        }
    }
    //e. liczby podzielne przez 3, 5 z zakresu 30 - 300 w nowych liniach
    public static void numbersInRangeDividedBy3And5() {
        for (int n = 30; n <= 300; n++) {
            if (n % 3 == 0 && n % 5 == 0)
                System.out.println(n);
        }
    }
    //f. liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami
    public static void evenNumbersInRange300() {
        for (int n = -300; n <= 300; n++) {
            if (n % 2 == 0)
                System.out.print(n + "; ");
        }
    }
    //g. liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami
    public static void evenNumbersInRange100() {
        for (int n = -100; n <= 100; n++) {
            if (n % 2 == 0)
                System.out.print(n + "; ");
        }
    }

    //h. litery od 'a' do 'z'
    public static void printAlphabetSmall(){
        for (char letter = 'a'; letter <= 'z'; letter++)
            System.out.println(letter);
    }

    //i. litery od ‘A’ do ‘Z’
    public static void printAlphabetCapital() {
        for (char letter = 'A'; letter <= 'Z'; letter++)
            System.out.println(letter);
    }

    //j. litery od ‘A’ do ‘Z’, tylko co drugą
    public static void evenLettersCapital() {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            if (letter % 2 == 0)
                System.out.println(letter);
        }
    }

    //k. litery od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest podzielny przez 5
    public static void alphabetFromB() {
        for (char letter = 98; letter <= 122; letter++) {
            if (letter % 5 == 0)
                System.out.println(letter);
        }
    }
    //l. ‘Hello World’ 100 razy przy każdym wypisaniu wypisz jego indeks (numer wypisania)

    public static void helloWorldX100(){
        for (int i = 1; i <= 100; i++)
            System.out.println(i + ". Hello World");
    }


}