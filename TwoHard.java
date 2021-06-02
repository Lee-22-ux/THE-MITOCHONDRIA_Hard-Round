/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twohard;

/**
 *
 * @author MilkTea
 */
public class TwoHard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0; 
        int x = 0;
        String [] mitochondria = {"Hello", "World", "in", "a", "frame"};
        
        while (i < 9) {

            if (x == 0 || x == 6) {
            System.out.println("*******");
            }
            if (x <= 4){
                System.out.print("*");
                
                System.out.print(mitochondria[x]);
                System.out.println("*");
                }
            x++;
            i++;
            }
            
        }
}  

