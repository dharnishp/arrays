/*
Write A Java Program to print all even & odd elements of an array ?
*/

package com.dharnish.arrays;

import java.util.Scanner;
public class Program13
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
		System.out.println("Even Elements of an array ");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("Odd Elements of an array ");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
