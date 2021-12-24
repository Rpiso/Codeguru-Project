/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static final private int LOWER_RANGE = 2;
    static final private int UPPER_RANGE = 1000;
    static final private int MAX_DIVISOR = 10;
    static final private int MIN_DIVISOR = 1;
    
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner myObj = new Scanner(System.in);
        String intero = myObj.nextLine(); 
		int num = Integer.parseInt(intero);
		if(num < LOWER_RANGE || num > UPPER_RANGE){
		  System.out.println("Input value must be between: " + LOWER_RANGE + " and " + UPPER_RANGE);
		  return;
		} 
		
		for(int i=MAX_DIVISOR; i>=MIN_DIVISOR; i--){
		    if((num % i) == 0) {
		        System.out.println(i);
		        return;
		    }
		}
		
	}
}
