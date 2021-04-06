import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5D_Attack {
    // Returns arguments in the console
    public static String MD5(String s) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        byte[] bytesOfS = s.getBytes("UTF-8");
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] theDigest = md.digest(bytesOfS);
        StringBuilder sb = new StringBuilder();
        for (byte b : theDigest) {
            sb.append(String.format("%02X", b));
        }
        String hash = sb.toString().toLowerCase();
        return hash;
    }

    public static String next(String s) {
        int length = s.length();
        char c = s.charAt(length - 1);

        if (c == 'z')
            return length > 1 ? next(s.substring(0, length - 1)) + 'a' : "aa";

        return s.substring(0, length - 1) + ++c;
    }

    public static String stringInit(int length, String str) {
        for(int i=0; i<length; i++)
        {
            str += "a";
        }
        return str;
    }

    public static void bruteForce(String pass) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        boolean found;
        int length;
        String guessString = "";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter length of password: ");
            length = sc.nextInt();
            if (length < 1) {
                System.out.println("Length cannot be less than 1");
            } else {
                guessString = stringInit(length, "");
                break;
            }
        }
        sc.close();

        while (true) {
            String Match = MD5(guessString);
            System.out.println(Match);
            if (Match.equals(pass)) {
                System.out.println("Password found: \n" + guessString);
                found = true;
                break;
            }
            guessString = next(guessString);
        }
        if (!found) {
            System.out.println("Password not Found");
            return;
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        // Main functionality of the code
        System.out.print("Enter the hash to find: ");
        Scanner S = new Scanner(System.in);
        String pass = S.nextLine();
        try {
            String path = "";
            int choice;
            while (true) {
                System.out.print("\n1. Dictionary attack\n2. Common passwords attack\n3. Brute force attack\n0. EXIT\nInput: ");
                choice = S.nextInt();
                if (choice == 1) {
                    path += "dictionary.txt";
                    break;
                } else if (choice == 2) {
                    path += "commonpasswords.txt";
                    break;
                } else if (choice == 3) {
                    bruteForce(pass);
                    S.close();
                    return;
                }
                else if(choice == 0)
                {
                    S.close();
                    return;
                } else {
                    System.out.println("Invalid choice!!\n");
                }
            }
            FileReader fr = null;
            BufferedReader br = null;
            File absolute = new File(path);
            fr = new FileReader(absolute);
            String currentLine;
            br = new BufferedReader(fr);
            int x = 0;
            while ((currentLine = br.readLine()) != null) {
                String Match = MD5(currentLine);
                System.out.println(Match);
                if (Match.equals(pass)) {
                    System.out.println("Password found : \n" + currentLine);
                    x = 1;
                    break;
                }
            }
            br.close();
            if (x != 1) {
                System.out.println("Password not Found:");
            }
        } catch (IOException e) {
            System.out.println("Wrong arguments");
        }
        S.close();
    }

}
