public class BasePlusCommissionEmployee extends CommissionEmployee{
  private double baseMonthlySalary;
  public BasePlusCommissionEmployee(String name, String department, int yearOfBirth, double grossSale,
      double commissionRate, double baseMonthlySalary) {
    super(name, department, yearOfBirth, grossSale, commissionRate);
    this.baseMonthlySalary = baseMonthlySalary;
  }

  public double getTotalAmount()
  {
    return getCommissionAmount() + baseMonthlySalary;
  }

  @Override
  public String toString()
  {
    return super.toString() + "\nBase monthly salary: " + baseMonthlySalary;
  }
}
