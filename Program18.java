/*
 * Write A Java Program to find 2nd largest ,3rd largest and 2nd smallest , 3rd Smallest elements of an array ?
 */
package arrayInterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Program19 
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
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//Arrays.sort(arr);
		System.out.println("2nd largest element of an array : "+arr[arr.length-2]);
		System.out.println("3rd largest element of an array : "+arr[arr.length-3]);
		System.out.println("2nd smallest element of an array : "+arr[1]);
		System.out.println("3rd smallest element of an array : "+arr[2]);
	}
}
