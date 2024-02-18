public class Main {
    public static void main(String[] args) {
        var adam = new Ksiegowy("Adam", "Wiśniewski",  6000);
        var agata = new PracownikIT("Agata", "Wróbel", 7500, 3);
        var pawel = new PracownikIT("Paweł", "Kowalski", 5000, 1);
        var ada = new Programista("Ada", "Nowak", 8000, 6);

        System.out.println(adam);
        System.out.println(agata);
        System.out.println(pawel);
        System.out.println(ada);
    }
}
