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
public class CalculatePi {
    public double approxpi(int iterationnum){
        int i=3;
        boolean evenodd = true;
        double pi = 1;
        while (i<= iterationnum + 3){
            if (evenodd){
                pi -= Math.pow(i, -1);
                evenodd = false;
            }
            else{
                pi += Math.pow(i, -1);
                evenodd = true;
            } 
            i += 2;
        }
        return 4*(pi);
    }
    
    public void printresult(){
        System.out.println(approxpi(10000));
    }
    
}
