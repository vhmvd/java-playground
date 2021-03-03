import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of theaters: ");
        int numOfTheaters = scan.nextInt();

        int   [] theatreId       = new int   [numOfTheaters];
        char  [] theatreCategory = new char  [numOfTheaters];
        int   [] operatingTime   = new int   [numOfTheaters];
        double[] hourlyRate      = new double[numOfTheaters];
        double[] operationCost   = new double[numOfTheaters];
        double[] sponsorsAmount  = new double[numOfTheaters];
        double[] netCost         = new double[numOfTheaters];

        for (int i = 0; i < numOfTheaters; i++) {
            System.out.print("Enter theatre category (A, B or C) for theatre #" + i + " >");
            theatreId[i] = i;
            theatreCategory[i] = scan.next().charAt(0);

            System.out.print("Enter theatre booking hours (int) for theatre #" + i + " >");
            operatingTime[i] = scan.nextInt();

            hourlyRate[i]     = hourlyRate(theatreCategory[i]);
            operationCost[i]  = operatingCost(theatreCategory[i], operatingTime[i]);
            sponsorsAmount[i] = sponsorsAmount(theatreCategory[i], operatingTime[i]);

            netCost[i] = operationCost[i] - sponsorsAmount[i];
        }
        scan.close();

        FileWriter outFile = new FileWriter("sponsor.txt");
        outFile.write("Data for theatre " + theatreId[0] + "\nCategory: " + theatreCategory[0] + "\nHourly rate: "
                + hourlyRate[0] + "\nOperation cost: " + operationCost[0] + "\nSponsors amount: " + sponsorsAmount[0]
                + "\nNet cost: " + netCost[0]);
        for (int i = 1; i < numOfTheaters; i++) 
        {
            outFile.append("\n\nData for theatre " + theatreId[i] + "\nCategory: " + theatreCategory[i]
                    + "\nHourly rate: " + hourlyRate[i] + "\nOperation cost: " + operationCost[i]
                    + "\nSponsors amount: " + sponsorsAmount[i] + "\nNet cost: " + netCost[i]);
        }

        double totalOperatingCost = 0;
        double totalSponsorsAmount = 0;
        double totalNet = 0;

        for(int i=0; i<numOfTheaters; i++)
        {
            totalOperatingCost = totalOperatingCost + operationCost[i];
            totalSponsorsAmount = totalSponsorsAmount + sponsorsAmount[i];
        }

        totalNet = totalOperatingCost - totalSponsorsAmount;

        outFile.append("\n\nTotal operating cost: " + totalOperatingCost + "\nTotal sponsors amount: "
                    + totalSponsorsAmount + "\nTotal net amount:" + totalNet);
        outFile.close();
    }



    public static double hourlyRate(char cat) {
        switch (cat) {
            case 'A':
                return 3500;
            case 'B':
                return 2800;
            case 'C':
                return 1700;
            default:
                return 0;
        }
    }

    public static double operatingCost(char cat, int operatingHrs) {
        double hrRate = hourlyRate(cat);
        double normalCost = 0, overCost = 0;

        if (operatingHrs <= 40) {
            normalCost = hrRate * operatingHrs;
        } else {
            normalCost = hrRate * 40;
            overCost = 2 * hrRate * (operatingHrs - 40);
        }
        return normalCost + overCost;
    }

    public static double sponsorsAmount(char cat, int operatingHrs) {
        double opCost = operatingCost(cat, operatingHrs);

        double amount = 0;

        System.out.print("Enter the Number of Sponsors: ");
        int spCount = scan.nextInt();

        for (int i = 1; i <= spCount; i++) {
            if (cat == 'A') {
                System.out.print("Sponsor " + i + ": Do you need to support by percentage or fixed amount (P/F)? ");
                char answer = scan.next().charAt(0);
                if (answer == 'P') {
                    System.out.print("Sponsor " + i + ": Enter your percentage (>=5): ");
                    double percent = scan.nextDouble();
                    while (percent < 5) {
                        System.out.print("Sponsor " + i + ": Enter your percentage (>=5): ");
                        percent = scan.nextDouble();
                    }
                    amount += opCost * percent / 100;
                } else {
                    System.out.print("Sponsor " + i + ": Enter your fixed amount (>=10000): ");
                    double fix = scan.nextDouble();
                    while (fix < 10000) {
                        System.out.print("Sponsor " + i + ": Enter your fixed amount (>=10000): ");
                        fix = scan.nextDouble();
                    }
                    amount += fix;
                }
            } else {
                System.out.print("Sponsor " + i + ": Enter your fixed amount (>=5000): ");
                double fix = scan.nextDouble();
                while (fix < 5000) {
                    System.out.print("Sponsor " + i + ": Enter your percentage (>=5000): ");
                    fix = scan.nextDouble();
                }
                amount += fix;
            }
        }
        return amount;
    }
}
