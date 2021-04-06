public class CustomerVisit {
  private Person personDetails;
  private Bill billDetails;
  private static int numOfVisits;
  private static int countBillsAbove200;
  private static int countBillsBelow200;
  private static int countKidsBelow14;
  private static int countPersonsAbove14;

  CustomerVisit()
  {
    // CustomerVisit.countBillsAbove200 = 0;
    // CustomerVisit.countKidsBelow14 = 0;
    // CustomerVisit.numOfVisits = 0;
    // CustomerVisit.countBillsBelow200 = 0;
    // CustomerVisit.countPersonsAbove14 = 0;
  }

  CustomerVisit(Person personDetails, Bill billDetails)
  {
    this.personDetails = new Person(personDetails.getName(), personDetails.getAge(), personDetails.getGender());

    if(this.personDetails.getAge() > 14)
    {
      CustomerVisit.countPersonsAbove14 += 1;
    }
    else
    {
      CustomerVisit.countKidsBelow14 += 1;
    }

    this.billDetails = new Bill(billDetails.getTimeOfPlaying());

    if(this.billDetails.getAmount() > 200)
    {
      CustomerVisit.countBillsAbove200 += 1;
    }
    else
    {
      CustomerVisit.countBillsBelow200 += 1;
    }
  }

  CustomerVisit(String name, int age, char gender, int timeOfPlaying)
  {
    this.billDetails = new Bill(timeOfPlaying);
    this.personDetails = new Person(name, age, gender);
  }

  public Person getPersonDetails()
  {
    return this.personDetails;
  }

  public Bill getBillDetails()
  {
    return this.billDetails;
  }

  public static int getNumOfVisits()
  {
    return CustomerVisit.numOfVisits;
  }

  public static int getCountBillsAbove200()
  {
    return CustomerVisit.countBillsAbove200;
  }

  public static int getCountBillsBelow200()
  {
    return CustomerVisit.countBillsBelow200;
  }

  public static int getCountKidsBelow14()
  {
    return CustomerVisit.countKidsBelow14;
  }

  public static int getCountPersonsAbove14()
  {
    return CustomerVisit.countPersonsAbove14;
  }

  public static double getAverageBill()
  {
    return Bill.getTotalAmount()/numOfVisits;
  }

  public static double getAveragePlayingTime()
  {
    return Bill.getTotalPlayingTime()/numOfVisits;
  }

  public String toString()
  {
    return personDetails.toString() + billDetails.toString();
  }

}
