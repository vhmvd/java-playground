import java.util.Scanner;

public class Fibonacci {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first Fibonacci: ");
    int firstNumber = sc.nextInt();
    System.out.print("Enter second Fibonacci: ");
    int secondNumber = sc.nextInt();
    System.out.print("Enter nth number for Fibonacci series: ");
    int seriesNth = sc.nextInt();
    System.out.println("***Fibonacci series***");
    System.out.print("" + firstNumber + " " + secondNumber);
    fibonacci(firstNumber, secondNumber, seriesNth);
    sc.close();
  }

  public static void fibonacci(int n1, int n2, int series) {
    if (series == 1) {
      return;
    }
    int result = n1 + n2;
    System.out.print(" " + result);
    fibonacci(n2, result, --series);
  }
}
