public class PartTimeEmployee extends Employee{
  private double wage;
  private int hours;

  public PartTimeEmployee(String name, String department, int yearOfBirth, double wage, int hours)
  {
    super(name, department, yearOfBirth);
    this.hours = hours;
    this.wage = wage;
  }

  public double getTotalWage()
  {
    return wage*(double)hours;
  }

  @Override
  public String toString()
  {
    return super.toString() + "\nWage: " + wage + "\nHours: " + hours;
  }
}
