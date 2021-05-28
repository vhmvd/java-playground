public class Bill {
  private int timeOfPlaying;
  private double amount;
  private static double totalAmount;
  private static int totalPlayingTime;

  Bill()
  {
    this.amount = 0;
    this.timeOfPlaying = 0;
  }

  Bill(int timeOfPlaying)
  {
    this.timeOfPlaying = timeOfPlaying;
    this.amount = this.timeOfPlaying * 50;
    Bill.totalPlayingTime += timeOfPlaying;
    Bill.totalAmount += this.amount;
  }

  public double getAmount()
  {
    return this.amount;
  }

  public int getTimeOfPlaying()
  {
    return this.timeOfPlaying;
  }

  public static double getTotalAmount()
  {
    return Bill.totalAmount;
  }

  public static int getTotalPlayingTime()
  {
    return Bill.totalPlayingTime;
  }

  public String toString()
  {
    return "\nTime played: " + this.timeOfPlaying + "\nAmount: " + this.amount + "\nTotal amount: " + Bill.totalAmount +
    "\nTotal playing time: " + Bill.totalPlayingTime;
  }

}
