/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock_Program;

/**
 *
 * @author GIGABYTE
 */
public class DisplayClock {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
    
    public DisplayClock(){
        hours=new NumberDisplay(24);
        minutes=new NumberDisplay(60);
        updateDisplay();
        
    }
    
    
    public DisplayClock(int hour, int minute){
        hours=new NumberDisplay(24);
        minutes=new NumberDisplay(60);
        setTime(hour, minute);
    }
    
    public void TimeTick(){
        minutes.increment();
        if(minutes.getValue()==0){
            hours.increment();
        }
        updateDisplay();
    }
    
    public void setTime(int hour, int minute){
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }
    
    public String getTime(){
        return displayString;
    }
    
    private void updateDisplay(){
        displayString= hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}
