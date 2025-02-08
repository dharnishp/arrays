/*
Write A Java Program to find the largest and smallest number in an unsorted integer array? 
*/

package com.dharnish.arrays;

import java.util.Scanner;
public class Program7 
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
		int large=arr[0],small=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		System.out.println("Largest number in array : "+large+"\nSmallest number in array : "+small);
	}
}
