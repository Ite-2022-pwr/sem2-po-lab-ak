public class Pracownik {
    private String firstname;
    private String surname;

    protected int salary;
    protected double bonus;  // premia
    protected double tax = 0.17;   // podatek

    public Pracownik(String firstname, String surname, int salary, double bonus) {
        this.firstname = firstname;
        this.surname = surname;
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getSalary() {
        double salarySum = salary + bonus * salary;
        salarySum -= tax * salarySum;
        return salarySum;
    }

    public String getName() {
        return this.firstname + " " + this.surname;
    }

    public String toString() {
        return getName() + ": " + getSalary();
    }
}