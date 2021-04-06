import java.util.ArrayList;

public class Cashier {
  private String name;
  private int counterID;
  private double totalAmount;
  private ArrayList<Customer> customers;

  Cashier(String name, int counterID)
  {
    this.name = name;
    this.counterID = counterID;
    totalAmount = 0.0;
    customers = new ArrayList<Customer>();
  }

  public void addCustomer(String transID, double amountPaid, int numItems)
  {
    this.totalAmount += amountPaid;
    customers.add(new Customer(transID, amountPaid, numItems));
  }

  public double totalAmount()
  {
    double amount = 0.0;
    for(int i=0; i<customers.size(); i++)
    {
      amount += customers.get(i).getAmount();
    }
    return amount;
  }

  public double countCashBox()
  {
    return this.totalAmount;
  }
}
