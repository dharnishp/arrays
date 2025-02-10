/*
 * Write A Java Program to  find all pairs of an integer array whose sum is equal to a given number? 
 */
package arrayInterviewQuestions;

import java.util.Scanner;

public class Program11 
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
		int target=scn.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println("{"+arr[i]+","+arr[j]+"}");
				}
			}
		}
	}
}
