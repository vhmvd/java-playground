import java.util.Random;
import java.util.Scanner;

public class ComputerGuessesNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    System.out.print("Enter the number for computer to guess: ");
    int randomNumber = sc.nextInt();
    int numberOfGuesses = 0;
    int guessed = 0;
    int bound = 100;
    int adjustment = 100;
    while (true) {
      System.out.print("Guessed number: ");
      guessed = rand.nextInt(bound);
      System.out.println(guessed);
      if (guessed > randomNumber) {
        System.out.println("Your guess is greater.");
        bound -= adjustment;
        numberOfGuesses++;
      } else if (guessed < randomNumber) {
        System.out.println("Your guess is smaller.");
        bound += adjustment;
        numberOfGuesses++;
      } else {
        System.out.println("Your guess is correct.");
        break;
      }
      if (numberOfGuesses > 10) {
        adjustment %= 10;
      } else if (numberOfGuesses > 20) {
        adjustment = 1;
      }
    }
    System.out.println("Number of guesses: " + numberOfGuesses);
    sc.close();
  }
}
