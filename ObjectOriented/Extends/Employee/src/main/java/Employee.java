public class Employee {
  protected String name;
  protected String department;
  protected int yearOfBirth;
  
  public Employee(String name, String department, int yearOfBirth)
  {
    this.name = name;
    this.department = department;
    this. yearOfBirth = yearOfBirth;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public void setDepartment(String department)
  {
    this.department = department;
  }
  
  public void setYearOfBirth(int YOB)
  {
    this.yearOfBirth = YOB;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getDepartment()
  {
    return this.department;
  }
  
  public int getYearOfBirth()
  {
    return this.yearOfBirth;
  }
  
  @Override
  public String toString()
  {
    return "\nName: " + name + "\nDepartment: " + department + "\nYear of birth: " + yearOfBirth;
  }
}
