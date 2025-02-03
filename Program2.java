/*
Program 2: Write a Java program to reverse an array.

Solution:

Sample Input:
5 (Size of an array)
1
5
3
6
2
Sample Output:
Original array
1 5 3 6 2 
reverse of an array
2 6 3 5 1 
*/

//Code:

import java.util.Scanner;
public class Program2 
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
		System.out.println("Original array");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nreverse of an array");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
