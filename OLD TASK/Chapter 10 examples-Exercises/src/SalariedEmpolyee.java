
    public class SalariedEmpolyee extends Employee {

    private double weeklySalary;


    public SalariedEmpolyee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

    if(weeklySalary< 0.0) {
        throw new IllegalArgumentException("Weekly salary cannot be negative");
    }

    this.weeklySalary = weeklySalary;
}

    public double getWeekSalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeekSalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%, .2f", super.toString(), "weekly salary", getWeekSalary());
    }

}
