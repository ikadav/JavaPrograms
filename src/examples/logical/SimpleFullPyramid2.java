package examples.logical;

import java.util.Scanner;

public class SimpleFullPyramid2 {
	
	   public static void main(String[] args) {
	       int row, temp, c, rows;
	       Scanner s = new Scanner(System.in);
	       System.out.println("Enter Number of Rows to print:");
	       rows = s.nextInt();
	       temp = rows;
	       System.out.println("Pyramid:");
	       for (row = 1; row <= rows; row++) {
	            for (c = 1; c < temp; c++)
	                 System.out.print(" ");
	            temp--;
	            for (c = 1; c <= 2 * row - 1; c++)
	                 System.out.print("*");
	            System.out.println("");
	       }
	       s.close();
	    }

}
