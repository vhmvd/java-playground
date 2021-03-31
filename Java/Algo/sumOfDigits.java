import java.util.Scanner;

public class sumOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    String digits = sc.next();
    int total = 0;
    for(int i=0; i<digits.length(); i++)
    {
      total += (int)(digits.charAt(i) - 48);
    }
    System.out.println("Sum: " + total);
    sc.close();
  }
}
