package binarysrch;
import java.util.Scanner;

public class BinarySearch {
	  public static void main(String args[])
	  {
	    int c, first, last, middle, n, search, array[];

	    Scanner in = new Scanner(System.in);
	    System.out.println("******************* Binary Search****************************");
	    System.out.println("Enter number of elements/numbers: ");
	    n = in.nextInt(); 
	    array = new int[n];
	    System.out.println("Enter " + n + " numbers: ");
	    for (c = 0; c < n; c++)
	      array[c] = in.nextInt();
	    System.out.println("Enter the number to be searched: ");
	    search = in.nextInt();
	 
	    first  = 0;
	    last   = n - 1;
	    middle = (first + last)/2;
	    while( first <= last )
	    {
	      if ( array[middle] < search )
	        first = middle + 1;    
	      else if ( array[middle] == search ) 
	      {
	        System.out.println(search + " found at location " + (middle + 1) + ".");
	        break;
	      }
	      else
	         last = middle - 1;
	      middle = (first + last)/2;
	   }
	   if ( first > last )
	      System.out.println(search + " is not present in the list.\n");
	   	System.out.print("Program Terminated");
	 	/*Name: Ronnel D. Avila
	 	 *Course: BS Information System-2
	 	 *Subject: DSA 
	 	 *Date: 08/07/16*/
	  
	  }
}
