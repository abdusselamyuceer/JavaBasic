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
public class AreaAndPerimeterofRectangle {
    
    private double side1,side2;
    Scanner sc = new Scanner(System.in);
    
    public double arearectangle(double pside1, double pside2){
        return pside1 * pside2;
    }
    public double perimeterrectangle(double pside1, double pside2){
        return pside1 + pside2; 
    }
    
    public void printresult(){
        System.out.println(  "area is: " + arearectangle(side1, side2));
        
        System.out.println("perimeter is: " + perimeterrectangle(side1, side2));
    }
    
    public double getSide1() {
        System.out.println("Enter length of side1");
        this.side1 = sc.nextDouble();
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        System.out.println("Enter length of side2");
        this.side2 = sc.nextDouble();
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
}
