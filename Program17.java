/*
 * Write A Java Program to print even position(index) and odd position(index) elements of an array ? 
 */
package arrayInterviewQuestions;

import java.util.Scanner;

public class Program17 
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
		System.out.println("Even position Elements ");
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("Odd position Elements ");
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
