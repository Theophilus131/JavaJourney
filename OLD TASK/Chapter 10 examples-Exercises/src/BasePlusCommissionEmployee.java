public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;



    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales, double commissionRate, double baseSalary) {
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);

        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary cannot be less than 0.");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary cannot be less than 0.");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();}

    @Override
    public String toString() {

       return String.format("base-salaried %s; base salary: $%,.2f", super.toString(), getBaseSalary());
    }

}
