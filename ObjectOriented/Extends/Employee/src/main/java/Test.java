import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {

  public static void main(String[] args) throws FileNotFoundException, IOException {

    BufferedReader read = new BufferedReader(new FileReader("input"));
    ArrayList<Employee> list = new ArrayList<>();
    for(int i=0; i<12; i++)
    {
      String[] line = read.readLine().split("-");
      switch (line[0]) {
        case "Employee" -> list.add(new Employee(line[1], line[2], (int) Double.parseDouble(line[3])));
        case "FullTimeEmployee" -> list.add(new FullTimeEmployee(line[1], line[2], Integer.parseInt(line[3]),
            Double.parseDouble(line[4]), Integer.parseInt(line[5])));
        case "PartTimeEmployee" -> list.add(new PartTimeEmployee(line[1], line[2], Integer.parseInt(line[3]),
            Double.parseDouble(line[4]), Integer.parseInt(line[5])));
        case "CommissionEmployee" -> list.add(new CommissionEmployee(line[1], line[2], Integer.parseInt(line[3]),
            Double.parseDouble(line[4]), Double.parseDouble(line[5])));
        case "BasePlusCommissionEmployee" -> list.add(new BasePlusCommissionEmployee(line[1], line[2], Integer.parseInt(line[3]),
            Double.parseDouble(line[4]), Double.parseDouble(line[5]), Double.parseDouble(line[6])));
        default -> {
        }
      }
    }

    displayEmployeeDetails(list);
    counters(list);

    System.out.println("");
    for (Employee i : list) {
      if (i instanceof FullTimeEmployee) {
        System.out.println(
            "Monthly Salary for FullTimeEmployee " + i.getName() + " is " + ((FullTimeEmployee) i).getMonthlySalary());
      }
    }

    System.out.println("");
    for (Employee i : list) {
      if (i instanceof PartTimeEmployee) {
        System.out.println(
            "Total Wage  for PartTimeEmployee " + i.getName() + " is " + ((PartTimeEmployee) i).getTotalWage());
      }
    }

    System.out.println("");
    for (Employee i : list) {
      if (i instanceof CommissionEmployee) {
        System.out.println("Commission Amount for CommissionEmployee " + i.getName() + " is "
            + ((CommissionEmployee) i).getCommissionAmount());
      }
    }

    System.out.println("");
    for (Employee i : list) {
      if (i instanceof BasePlusCommissionEmployee) {
        System.out.println("Total Amount for BasePlusCommissionEmployee " + i.getName() + " is "
            + ((BasePlusCommissionEmployee) i).getTotalAmount());
      }
    }
  }

  public static void displayEmployeeDetails(ArrayList<Employee> list) {
    for (Employee i : list) {
      System.out.println(i.toString());
    }
  }

  public static void counters(ArrayList<Employee> list) {
    int all = list.size();
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    for (Employee i : list) {

      if (i instanceof FullTimeEmployee) {
        b++;
      } else if (i instanceof PartTimeEmployee) {
        c++;
      } else if (i instanceof CommissionEmployee || i instanceof BasePlusCommissionEmployee) {
        d++;
      } else {
        a++;
      }
    }
    System.out.println("All Employees = " + all);
    System.out.println("Just Employees = " + a);
    System.out.println("Full Time Employees = " + b);
    System.out.println("Part Time Employees = " + c);
    System.out.println("All Commission Employees = " + d);
  }
}
