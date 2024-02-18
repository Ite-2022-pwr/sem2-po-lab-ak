public class Main {
    public static void main(String[] args) {
        var train = new Train();
        var plane = new Airplane();

        System.out.println("* Zysk dla dystansu 200, wynagrodzenia 10 i pociągu: " + train.calculateProfit(10, 200) + "\n");

        System.out.println("* Samolot:");
        System.out.println("\t- dystans 50, wynagrodzenie 50: " + plane.calculateProfit(50, 50));
        System.out.println("\t- dystans 30, wynagrodzenie 40: " + plane.calculateProfit(40, 30));
        System.out.println();

        System.out.println("* Dystans 350, wynagrodzenie 45:");
        System.out.println("\t- samolot: " + plane.calculateProfit(45, 350));
        System.out.println("\t- pociąg: " + train.calculateProfit(45, 350));
    }
}
