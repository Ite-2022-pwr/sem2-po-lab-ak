public class PracownikIT extends Pracownik {

    private int experience;

    public PracownikIT(String firstname, String surname, int salary, int exp) {
        super(firstname, surname, salary, calculateBonus(exp));
        this.experience = exp;
    }

    private static double calculateBonus(int experience) {
        if (experience < 2) {
            return 500.0;
        } else if (experience < 5) {
            return 2000.0;
        } else {
            return 5000.0;
        }
    }

    @Override
    public double getSalary() {
        return this.salary + this.bonus - (this.salary + this.bonus) * this.tax;
    }

    public int getExperience() {
        return this.experience;
    }
}
