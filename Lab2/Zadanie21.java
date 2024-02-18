import java.util.Scanner;

class Zadanie21 {

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        
        System.out.print("Podaj numer wyrazu ciągu Fibonacciego: ");
        int number = scanner.nextInt();

        int resultIterative = Fib.fibIterative(number);
        System.out.println("Iteracyjnie: " + resultIterative);

        int resultRecursive = Fib.fibRecusrive(number);
        System.out.println("Rekurencyjnie: " + resultRecursive);

        scanner.close();
    }    
}
