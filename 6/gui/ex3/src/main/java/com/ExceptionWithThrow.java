/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ahmn2
 */
public class ExceptionWithThrow {
    
    public static String validPhoneNum(String name) throws InputMismatchException
    {
        if(name.length() <9 || name.length() >10)
            throw new InputMismatchException("Length should be 9 or 10");
        else
        {
            for(int i=0; i<name.length(); i++)
            {
                if(Character.isAlphabetic(name.charAt(i)))
                {
                    throw new InputMismatchException("Characters are present!");
                }
            }
        }
        return name;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a phone number: ");
        String number = sc.nextLine();
        try
        {
            validPhoneNum(number);
        }
        catch(Exception e)
        {
            System.out.println("Exception: " + e);
        }
    }
}
