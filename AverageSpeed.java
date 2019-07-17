/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubjavabasic;

import java.util.Scanner;

/**
 *
 * @author abdusselam.yuceer
 */
public class AverageSpeed {
    private double kilometer;
    private int minute;
    private int second;
    Scanner sc = new Scanner(System.in);
    
    public double calculateaveragespeed(double pkilometer, int pminute, int psecond){
        double hour;
        hour = (psecond / 3600) + (pminute / 60);
        return pkilometer / hour; 
    }
    
    public void printresult(){
        System.out.println(  "Average speed is: " + calculateaveragespeed(kilometer, minute, second));
    }

    public double getKilometer() {
        System.out.println("Enter the kilometer");
        this.kilometer = sc.nextDouble();
        return kilometer;
    }

    public void setKilometer(double kilometer) {
        this.kilometer = kilometer;
    }

    public int getMinute() {
        System.out.println("Enter the minute");
        this.minute = sc.nextInt();
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        System.out.println("Enter the second");
        this.second = sc.nextInt();
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
}
