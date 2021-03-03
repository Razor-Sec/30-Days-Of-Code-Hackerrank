import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int num = 4;
        double numdoub = 4.0;
        String str = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        int num2;
        double numdoub2;
        String str2;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        num2 = scan.nextInt();
        numdoub2 = scan.nextDouble();
        scan.nextLine();
        str2 = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(num + num2);

        /* Print the sum of the double variables on a new line. */
		System.out.println(numdoub + numdoub2);

        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(str + str2);
        
        scan.close();
    }
}