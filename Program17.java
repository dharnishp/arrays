package com.dharnish.arrays;

import java.util.Scanner;
public class Program18
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		int evenCount=0,oddCount=0;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Count of Even Elements in array : "+evenCount);
		System.out.println("Count of Odd Elements in array : "+oddCount);
	}
}

