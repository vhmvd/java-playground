import java.util.Random;
import java.util.Scanner;

/**
 * NumberGuessing
 */
public class NumberGuessing {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int randomNumber = rand.nextInt(100);
    int numberOfGuesses = 0;
    int guessed = 0;
    while (true) {
      System.out.print("Guess the number: ");
      guessed = sc.nextInt();
      if (guessed > randomNumber) {
        System.out.println("Your guess is greater.");
        numberOfGuesses++;
      } else if (guessed < randomNumber) {
        System.out.println("Your guess is smaller.");
        numberOfGuesses++;
      } else {
        System.out.println("Your guess is correct.");
        break;
      }
    }
    System.out.println("Number of guesses: " + numberOfGuesses);
    sc.close();
  }
}