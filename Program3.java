/*Program 3: Write a Java program to find if an array contains a certain value.

Sample Input:
5 (Size of an array)
1
5
3
6
2

6 (Finding value)
Sample Output:
yes
*/
//Code:
package com.dharnish.arrays;
import java.util.Scanner;
public class Program3 
{
	public static void main(String[] args) 
	{	
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		int find=scn.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==find)
			{
				System.out.println("yes");
				break;
			}
		}
	}
}
