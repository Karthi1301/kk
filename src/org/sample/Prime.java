package org.sample;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int n,count=0;
		System.out.println("enter the number");
		n=a.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count =1;
			}
		}
		if(count==0)
		{
			System.out.println("prime");
			
		}
		else
		{
			System.out.println("not prime");
		}
		
	}

}
