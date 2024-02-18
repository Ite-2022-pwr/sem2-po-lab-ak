import java.util.Scanner;

class Zadanie30 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe pieter w trojkacie Pascala: ");
        int number = scanner.nextInt();

        Triangle.printTriangle(number);

        scanner.close();
    }
}