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
public class AreaAndPerimeterofCircle {
    
    private double radius;
    
    public double areacircle(double pradius){
        return Math.PI * Math.pow(pradius, 2); 
    }
    public double perimetercircle(double pradius){
        return Math.PI * pradius * 2; 
    }
    
    public void printresult(){
        
        System.out.println("area is: " + areacircle(radius));
        
        System.out.println("perimeter is: " + perimetercircle(radius));
    }
    
    public double getRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        this.radius = sc.nextDouble();
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
   
    
}
