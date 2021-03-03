/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmn2
 */
public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
    
    public ClockDisplay(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        displayString = "";
    }
    
    public ClockDisplay(int hr, int min){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        this.hours.setValue(hr);
        this.minutes.setValue(min);
        displayString = "";
    }
    
    public void setTime(int hr, int min){
        this.hours.setValue(hr);
        this.minutes.setValue(min);
    }
    
    public void timeTick(){
        this.minutes.increment();
        if(this.minutes.getValue() == 0){
            this.hours.increment();
        }
    }
    
    public String getTime(){
        displayString = this.hours.getDisplayValue() + ":" + this.minutes.getDisplayValue();
        return displayString;
    }
}
