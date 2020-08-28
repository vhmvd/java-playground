import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CSVread  
{
    List<String> poi;
    String temp, start, end;
    int noOfPOI;
    CSVread()
    {
        File myObj;
        Scanner myReader;
        try
        {
            myObj = new File("roads.csv");
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) 
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try
        {
            myObj = new File("attractions.csv");
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) 
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter name of tour starting city: ");
        start = input.next();
        System.out.println("\nEnter name of tour ending city: ");
        end = input.next();
        System.out.println("\nEnter number of POI you want to visit: ");
        noOfPOI = input.nextInt();
        if(noOfPOI > 0)
        {
            poi = new ArrayList<>();
        }
        else if(noOfPOI == 0)
        {
            temp = null;
        }
        else
        {
            System.out.println("\nCannot be negative!!");
        }
    }
}