public class FullTimeEmployee extends Employee{
  private double annualSalary;
  private int yearOfContractExp;
  public FullTimeEmployee(String name, String department, int yearOfBirth, double annualSalary, int yearOfContractExp) {
    super(name, department, yearOfBirth);
    this.annualSalary = annualSalary;
    this.yearOfContractExp = yearOfContractExp;
  }
  
  public void setAnnualSalary(double s)
  {
    this.annualSalary = s;
  }

  public double getMonthlySalary()
  {
    return this.annualSalary/12;
  }

  public String toString()
  {
    return super.toString() + "\nAnnual Salary: " + annualSalary + "\nContract length: " + yearOfContractExp;
  }
}
