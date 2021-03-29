
public class CustomerVisit {

  private Time timeDetails;
  private Bill billDetails;
  private static int NumOfVisits = 0;

  public CustomerVisit() {
    this.timeDetails = new Time();
    this.billDetails = new Bill();
    NumOfVisits++;
  }

  public CustomerVisit(Time timeDetails, Bill billDetails) {
    this.timeDetails = new Time(timeDetails.getDay(), timeDetails.getMonth(), timeDetails.getYear(), timeDetails.getHour(), timeDetails.getMinute());
    this.billDetails = new Bill(billDetails.getnumOfPersons(), billDetails.getAmount());
    NumOfVisits++;
  }

  public Time getTimeDetails() {
    return timeDetails;
  }

  public Bill getBillDetails() {
    return billDetails;
  }

  public static int getNumOfVisits() {
    return NumOfVisits;
  }

  public static double getAverageBillsAmount() {
    return Bill.getTotalAmount() / NumOfVisits;
  }

  public static int getAverageBillPersons() {
    return (int) (Bill.getTotalAmount()/ Bill.getTotalNumOfPersons());
  }

  public String toString() {
    return timeDetails + ",\n" + billDetails + "\n";
  }
}
