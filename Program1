/*
Program 1: Write a Java program to find the maximum element in an array.

Solution:

Sample Input:
5 (Size of an array)
1
5
3
6
2
Sample Output:
6
*/

// Approach 1: (Using inbuild methods)

import java.util.Scanner;
import java.util.Arrays;
public class Program1 
{
	public static void main(String[] args) 
{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[n-1]);
	}
}

// Approach 2: (without using inbuild methods)

import java.util.Scanner;
public class Program1 
{
	public static void main(String[] args) 
{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
