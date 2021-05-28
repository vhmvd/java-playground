public class Test {

  public static void main(String[] args) {
    Account a1 = new Account(100);
    Account a2 = new Account();

    System.out.println(a1.getBalance()); 
    a1.setBalance(a2.getBalance());
    System.out.println(a1.getBalance());
    System.out.println(a2.getBalance());
  }

}
