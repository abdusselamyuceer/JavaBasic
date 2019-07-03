/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubjavabasic;

/**
 *
 * @author abdusselam.yuceer
 */
public class ExponentTable {
    public void printexp(){
        System.out.println("a\ta^2\ta^3\ta^4");
        int i;
        for(i = 1; i < 5; i++){
            System.out.println(i + "\t" + (int)Math.pow(i, 2) +  "\t" + (int)Math.pow(i, 3) + "\t" + (int)Math.pow(i, 4));
        }
    }
    
}
