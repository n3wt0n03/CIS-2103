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
public class TimeTest {
    public static void main(String[] args) {
        MyTime t1 = new MyTime();
        MyTime t2 = new MyTime(12, 00, 00, false);
        
        System.out.println(t1);
        System.out.println(t2);

        
        //add 1 second both in t1 and t2
        t1.tickBySecond();
        t1.tickByMinute();
        t1.tickByHour();
        
        
        t2.tickBySecond();
        t2.tickByMinute();
        t2.tickByHour();
        
        //display new time
        System.out.println("\nt1: ");
        t1.display12Hour();
        t1.display24Hour(); 
        
        System.out.println("\nt2: ");
        t2.display12Hour();
        t2.display24Hour();
        
        //advance time by seconds
        t1.advanceTime(3600);
        t2.advanceTime(3600);
        
        //display new time
        System.out.println("\nAdvanced Time t1: ");
        t1.display12Hour();
        t1.display24Hour(); 
        
        System.out.println("\nAdvanced Time t2: ");
        t2.display12Hour();
        t2.display24Hour();
    }
}
