/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int c=a*b;
		int f1=0;
		if(a==0||b==0)
		{
			System.out.print("yes");
		}
		else if(a==b)
		{
			System.out.print("yes");
		}
		else
		{
			for(int i=1;i<=c/2;i++)
			{
				if((i*i)==c)
				{
					f1=1;
					break;
				}
			}
			if(f1==1)
			 {
			 	System.out.print("yes");
			 }
			 else
			 {
			 	System.out.print("no");
			 }
		}// your code goes here
	}
}
