import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
  public static void main(String[] args) throws FileNotFoundException {
    Cashier test = new Cashier("Ali", 25);

    File myFile = new File("input.txt");
    Scanner sc = new Scanner(myFile);

    String id;
    double amount;
    int item;
    while (sc.hasNextLine()) {
      id = sc.nextLine();
      amount = sc.nextDouble();
      item = sc.nextInt();
      test.addCustomer(id, amount, item);
    }

    if(test.countCashBox() == test.totalAmount())
    {
      System.out.println("Cash OK!");
    }
    else if(test.countCashBox() < test.totalAmount())
    {
      System.out.println("It is cashiers day!");
    }
    else
    {
      System.out.println("Some money missing");
    }
  }
}
