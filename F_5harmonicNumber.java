package nitikesh;

import java.util.Scanner;

public class F_5harmonicNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a num for harmonic :");
		int num=sc.nextInt();
		System.out.println();
		double result=0;
		for(double i=1;i<=num;i++)
		{
			result+=(1/i);
			System.out.print("1/"+i+"+ ");
		}
		
		System.out.print("="+result);
		
	}
}