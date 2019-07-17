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
 * (Population projection) The U.S. Census Bureau projects population based on the
 * following assumptions:
 * ¦¦ One birth every 7 seconds
 * ¦¦ One death every 13 seconds
 * ¦¦ One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years.
 */
public class PopulationCalculate {
    private int currentcount;
    private int passedsecond;
    Scanner sc = new Scanner(System.in);
    
    public int calculatepopulation(){
        return currentcount + (passedsecond / 7) - (passedsecond / 13) - (passedsecond / 45);
    }
    
    public void printresult(){
        System.out.println(  "total population is: " + calculatepopulation());
    }
    
    public int getCurrentcount() {
        System.out.println("Enter the current population");
        this.currentcount = sc.nextInt();
        return currentcount;
    }

    public void setCurrentcount(int currentcount) {
        this.currentcount = currentcount;
    }

    public int getPassedsecond() {
        System.out.println("Enter the passed second");
        //You can receive passed time as day, month or year then convert it to second I prefer simple one :)
        this.passedsecond = sc.nextInt();
        return passedsecond;
    }

    public void setPassedsecond(int passedsecond) {
        this.passedsecond = passedsecond;
    }
    
}
