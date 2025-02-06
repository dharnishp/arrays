/*
Program 4: Write a Java program to find the sum of all elements in an array

Solution:

Sample Input:
5 (Size of an array)
10
20
30
40
50

Sample Output:
150

Code:
*/
package com.dharnish.arrays;

import java.util.Scanner;
public class Program4
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
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
