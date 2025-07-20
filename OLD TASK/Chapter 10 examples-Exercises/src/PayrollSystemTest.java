public class PayrollSystemTest {
    public static void main(String[] args) {

        SalariedEmpolyee salariedEmpolyee = new SalariedEmpolyee("john","smith", "111-111-111", 800.0);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("karan", "price","222-222-222", 16.75, 40);

        CommissionEmployee commissionEmployee = new CommissionEmployee("sue", "jones","333-333-333", 10000, .06);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("bob", "lewis","444-444-444", 5000, .04, 300);

        System.out.println("Emloyee processed individually: ");

        System.out.printf("%n%s%n%s: $%, .2f%n%n", salariedEmpolyee, "earned", salariedEmpolyee.earnings());

        System.out.printf("%n%s%n%s: $%, .2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());

        System.out.printf("%n%s%n%s: $%, .2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());

        System.out.printf("%n%s%n%s: $%, .2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmpolyee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employee processed polymorphically: %n%n");

        for (Employee employee : employees) {
            System.out.println(employee);
        }



    }
}
