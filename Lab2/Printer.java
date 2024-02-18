import java.util.Scanner;

public class Printer {

    public static void main(String[] args) {
        
        System.out.print("Podaj liczbe: ");
        var scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        printEven(number);
    }

    public static void printEven(int N) {

        for (int n = 0; n <= N; n += 2) {
            System.out.println(n);
        }
    }
}