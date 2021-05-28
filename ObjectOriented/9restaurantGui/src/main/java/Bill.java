
public class Bill {

    private int numOfPersons;
    private double amount;
    static private double totalAmount;
    static private int totalNumOfPersons;

    public Bill() {
        this.numOfPersons = 0;
        this.amount = 0;
        this.totalAmount = 0;
        this.totalNumOfPersons = 0;
    }

    public Bill(int numOfPersons, double amount) {
        this.numOfPersons = numOfPersons;
        this.amount = amount;
        this.totalAmount += amount;
        this.totalNumOfPersons += numOfPersons;
    }

    public int getnumOfPersons() {
        return numOfPersons;
    }

    public double getAmount() {
        return amount;
    }

    public static double getTotalAmount() {
        return totalAmount;
    }

    public static int getTotalNumOfPersons() {
        return totalNumOfPersons;
    }

    public String toString() {
        return "Bill\nNum Of Persons: " + numOfPersons + ", Amount: " + amount;
    }
}
