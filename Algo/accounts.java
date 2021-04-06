import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class accounts {
  public static void main(String[] args) throws IOException, FileNotFoundException {
    FileReader fr = new FileReader("bank.txt");
    Scanner sc = new Scanner(fr);
    String account = sc.next();
    double startingAmount = sc.nextDouble();
    double withdraw = 0;
    double deposit = 0;
    double interest = 0;
    double totalWithdraw = 0;
    double totalDeposit = 0;
    double totalInterest = 0;
    int depositCount = 0;
    int withdrawCount = 0;
    FileWriter fw = new FileWriter("result.txt", true);
    fw.write("Account: " + account + "\n");
    fw.write("Beginning balance: " + startingAmount + "\n");
    while (sc.hasNextLine()) {
      String operation = sc.next();
      if(operation.charAt(0) == 'W')
      {
        withdraw = sc.nextDouble();
        startingAmount -= withdraw;
        totalWithdraw += withdraw;
        withdrawCount++;
      }
      else if(operation.charAt(0) == 'I')
      {
        interest = sc.nextDouble();
        interest = startingAmount*interest;
        startingAmount -= interest;
        totalInterest += interest;
      }
      else if(operation.charAt(0) == 'D')
      {
        deposit = sc.nextDouble();
        startingAmount += deposit;
        totalDeposit += deposit;
        depositCount++;
      }
    }
    fw.write("Ending balance: " + startingAmount + "\n");
    fw.write("Interest paid: " + totalInterest + "\n");
    fw.write("Amount deposited: " + totalDeposit + "\n");
    fw.write("Deposits made: " + depositCount + "\n");
    fw.write("Amount withdrawn: " + totalWithdraw + "\n");
    fw.write("Withdraws made: " + withdrawCount + "\n");
    fw.close();
    sc.close();
  }
}
