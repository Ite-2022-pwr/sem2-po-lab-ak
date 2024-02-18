public class Programista extends PracownikIT{
    public Programista(String firstname, String surname, int salary, int exp) {
        super(firstname, surname, salary, exp);
        this.tax /= 2;
    }
}
