/**
 * Customer
 */
public class Customer {

  private String transactionID;
  private double amount;
  private int numberOfItems;

  Customer(String transactionID, double amount, int numberOfItems)
  {
    this.transactionID = transactionID;
    this.amount = amount;
    this.numberOfItems = numberOfItems;
  }

  public double getAmount(){return amount;};
}