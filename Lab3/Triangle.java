import java.util.*;

public class Triangle {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe pieter w trojkacie Pascala: ");
        int number = scanner.nextInt();

        printTriangle(number);

        scanner.close();
    }

    public static void printTriangle(int N) {

        int rowWidth = 2 * N - 1;
        int[][] tab = new int[N][rowWidth];

        for (var arr : tab) {
            Arrays.fill(arr, 0);
        }

        // wypełnienie pierwszego wiersza
        tab[0][rowWidth / 2] = 1;

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < rowWidth - 1; j++) {
                tab[i][j] = tab[i - 1][j - 1] + tab[i - 1][j + 1];
            }
        }

        // dopełnienie jedynkami ostatniego wiersza
        tab[N - 1][0] = 1;
        tab[N - 1][rowWidth - 1] = 1;

        // wypisanie trójkąta
        for (var arr : tab) {
            System.out.println(Arrays.toString(arr));
        }
    }
}