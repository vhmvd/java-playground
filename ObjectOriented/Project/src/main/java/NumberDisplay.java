/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmn2
 */
public class NumberDisplay {
    private int limit;
    private int value;
    
    public NumberDisplay(int limit){
        this.limit = limit;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int newValue){
        if(newValue <= limit){
            this.value = newValue;
        }
    }
    
    public String getDisplayValue(){
        if(value < 10)
        {
            return  "0" + Integer.toString(value);
        }
        else
        {
            return  Integer.toString(value);
        }
    }
    
    public void increment(){
        if(value == limit){
            value = 0;
        }
        else{
            ++value;
        }
    }
}
