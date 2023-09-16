/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeActivity;

/**
 *
 * @author NewtskieTzy
 */
public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    private boolean meridian = true;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second, boolean meridian) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.meridian = meridian;
    }

    public void setHour(int hour) {
        if(hour > 12){
            System.out.println("Hours must be 1-12 only.");
        } else {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute > 59) {
           System.out.println("Minutes must be 0-59 only.");
        } else {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second > 59) {
           System.out.println("Seconds range 0-59 only.");
        } else {
            this.second = second;
        }
    }

    public void setMeredian(boolean meridian) {
        this.meridian = meridian;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String isMeridian() {
       return meridian ? "AM" : "PM";
    }
    
    public void advanceTime(int seconds){
        for (int i = 0; i < seconds; i++) {
            tickBySecond();
        }
    }
    
    public void tickByHour(){
        hour++;
        if(hour > 12) {
            hour -= 12;
            meridian = false;
        }
    }
    
    public void tickByMinute(){
        minute++;
        if(minute >= 60){
            minute -= 60;
            tickByHour();
        }
    }
    
    public void tickBySecond(){
        second++;
        if(second >= 60){
            second -= 60;
            tickByMinute();
        }
    }
    
    public void display12Hour(){
        System.out.printf("TIME in 12 Hour Format: %02d:%02d:%02d %s%n", hour, minute, second, isMeridian());
    }
    
    public void display24Hour(){
        if(meridian == true) {
            System.out.printf("TIME in 24 Hour Format: %02d:%02d:%02d%n", hour, minute, second);
        } else {
            System.out.printf("TIME in 24 Hour Format: %02d:%02d:%02d%n", hour + 12, minute, second);
        }
    }    

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", hour, minute, second, isMeridian());
   }
    
    
}
