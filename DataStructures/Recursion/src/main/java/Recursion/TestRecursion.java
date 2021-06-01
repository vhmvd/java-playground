package Recursion;

import java.util.Scanner;

public class TestRecursion {
  public static void main(String[] args) {
    Recursion object = new Recursion();
    Scanner sc = new Scanner(System.in);

    System.out.print("Number of lines for pattern: ");
    object.pattern1(sc.nextInt());

    System.out.print("Number of lines for pattern: ");
    object.pattern2(sc.nextInt());

    sc.nextLine();
    System.out.print("Enter string to count vowels: ");
    System.out.println(object.vowels(sc.nextLine()));

    System.out.print("Enter string to check if it's a palindrome: ");
    System.out.println(object.palindromeCheck(sc.nextLine()));

    sc.close();
  }
}
