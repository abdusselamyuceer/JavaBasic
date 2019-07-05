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
public class SumOfSequence {
    public int sumsequence(int plastnum){
        int i = 0;
        int sum = 0;
        while (i <= plastnum ){
            sum += plastnum;
            i++;
        }
        return sum;
    }
    
    public void printresult(){
        System.out.println(sumsequence(10));
    }
    
}
