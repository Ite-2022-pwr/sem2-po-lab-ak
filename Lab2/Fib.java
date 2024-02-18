import java.util.*;

public class Fib {

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        
        System.out.print("Podaj numer wyrazu ciągu Fibonacciego: ");
        int number = scanner.nextInt();

        int resultIterative = fibIterative(number);
        System.out.println("Iteracyjnie: " + resultIterative);

        int resultRecursive = fibRecusrive(number);
        System.out.println("Rekurencyjnie: " + resultRecursive);

        scanner.close();
    }

    public static int fibIterative(int N) {
        if (N < 1)
            throw new IllegalArgumentException("Ciąg Fibbonacciego zaczyna się od 1");

        if (N == 1 || N == 2) {
            return 1;
        } else {
            ArrayList<Integer> fibSequence = new ArrayList<>();
            fibSequence.add(1);
            fibSequence.add(1);

            for (int i = 2; i < N; i++) {
                Integer nextFibNumber = fibSequence.get(i - 1) + fibSequence.get(i - 2);
                fibSequence.add(nextFibNumber);
            }

            return fibSequence.get(fibSequence.size() - 1);
        }
    }

    public static int fibRecusrive(int N) {
        if (N < 1)
            throw new IllegalArgumentException("Ciąg Fibbonacciego zaczyna się od 1");

        if (N == 1 || N == 2)
            return 1;
        else
            return fibRecusrive(N - 1) + fibRecusrive(N - 2);
    }
}
