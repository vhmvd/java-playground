public class depositCalculator {
  public static void main(String[] args) {
    double deposit = 1000;
    for (int i = 0; i < 10; i++) {
      deposit += (deposit * 0.05);
    }
    System.out.println("Initial deposit: 1000\nDeposit after 10 years at 5% interest pa: " + deposit);
  }
}
