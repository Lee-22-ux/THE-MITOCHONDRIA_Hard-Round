/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author THE MITOCHONDRIA
 */
public class ONE {

    /**
     * @param args the command line arguments
     */
        public static BigDecimal pi =  BigDecimal.ZERO;
	public static BigDecimal MITO1 =  BigDecimal.ONE;
	public static BigDecimal MITO2 =  BigDecimal.ONE;
	public static BigDecimal RNA1 =  BigDecimal.ZERO;
	public static BigDecimal RNA2 =  BigDecimal.ZERO;

	public static void calculatepi(int x)
	{
		for(int i = 2; i < 1000; i += 4)
		{	
			MITO1 =  BigDecimal.ONE;
			MITO1 = MITO1.multiply(new BigDecimal(i));
			MITO1 = MITO1.multiply(new BigDecimal(i+1));
			MITO1 = MITO1.multiply(new BigDecimal(i+2));
			
			MITO2 =  BigDecimal.ONE;		
			MITO2 = MITO2.multiply(new BigDecimal(i+2));
			MITO2 = MITO2.multiply(new BigDecimal(i+3));
			MITO2 = MITO2.multiply(new BigDecimal(i+4));
			
			// accuracy parameters set to 1000 arbitrarily
			RNA1 = new BigDecimal("4").divide(MITO1, 1000, RoundingMode.HALF_UP);
			RNA2 = new BigDecimal("-4").divide(MITO2, 1000, RoundingMode.HALF_UP);
			
			pi = pi.add(RNA1); 
			pi = pi.add(RNA2); 
			}
		
		// 3 + calculated value
		pi = pi.add(new BigDecimal (3));
		
		// user digit input applied
		pi = pi.setScale(x,  BigDecimal.ROUND_HALF_UP);
	}

	public static void prompt()
	{
		int x = 30;
		
		calculatepi(x);
		System.out.println("Pi: " + pi);
		
		pi =  BigDecimal.ZERO;
		
		return;
	}
	
	public static void main(String[] args) 
	{
		prompt();
	}
}
