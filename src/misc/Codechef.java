package misc;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int count = 0;
        
        if(N%5 == 0) count++;
        if(N%11 == 0) count++;
        
        if(count == 0) System.out.println("NONE");
        else if(count == 1) System.out.println("ONE");
        else System.out.println("BOTH");
	}
}
