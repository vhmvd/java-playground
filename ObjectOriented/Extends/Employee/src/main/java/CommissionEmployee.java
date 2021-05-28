public class CommissionEmployee extends Employee{
  private double grossSale;
  private double commissionRate;

  public CommissionEmployee(String name, String department, int yearOfBirth, double grossSale, double commissionRate)
  {
    super(name, department, yearOfBirth);
    this.grossSale = grossSale;
    this.commissionRate = commissionRate;
  }

  public double getCommissionAmount()
  {
    return commissionRate * grossSale;
  }

  @Override
  public String toString()
  {
    return super.toString() + "\nCommission rate: " + commissionRate + "\nGross sale: " + grossSale;
  }
}
