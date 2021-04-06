package com.mycompany.passwordcracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;
import java.util.Scanner;

public class MD5D_Attack {
	// Returns arguments in the console
    public static String MD5(String s) throws UnsupportedEncodingException,
            NoSuchAlgorithmException {
        
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

    public static void main(String[] args) throws UnsupportedEncodingException,NoSuchAlgorithmException {
        // Main functionality of the code
        System.out.println("Enter the hash to find:");
        Scanner S=new Scanner(System.in);
        String pass= S.nextLine();
         
        try{
            String path;
            System.out.println("Please input the path to dictionary file ");
            // function for comparing the hash
            path = S.nextLine();
             FileReader fr = null;
        BufferedReader br = null;
         File absolute = new File(path);
          fr = new FileReader(absolute);
            String currentLine;
            br = new BufferedReader(fr);
            int x=0;
             while ((currentLine = br.readLine()) != null) 
             {
                 
                 String Match = MD5(currentLine);
                 System.out.println(Match);
                 if (    Match.equals(pass) )
                     
                 {
                     
                     
                     System.out.println("Password found : \n"+currentLine);
                     x = 1;
                     break;
                     
                 }
                        
                 
             }
             if(x!=1){
              System.out.println("Password not Found:");
             }
             
             }
             catch (IOException e)
                     {
                         System.out.println("Wrong arguments");
                     
                     }
      
        // Test hash and dictionary file location
		//74b87337454200d4d33f80c4663dc5e5
        //C:\Users\Computer\Desktop\dictionary.txt
        
        
        
    }
    
 }
