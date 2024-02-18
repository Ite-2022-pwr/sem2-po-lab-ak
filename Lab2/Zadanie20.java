import java.util.Scanner;

class Zadanie20 {
    public static void main(String[] args) {
        
        System.out.print("Podaj liczbe: ");
        var scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        Printer.printEven(number);
    }
}
