/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmn2
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClockDisplay testObject = new ClockDisplay();
        ClockDisplay test = new ClockDisplay(10,50);
        testObject.setTime(12, 0);
        System.out.println(testObject.getTime());
        System.out.println(test.getTime());
    }
    
}
