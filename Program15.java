/*
Write A Java Program to Merge two arrays?
*/

package com.dharnish.arrays;

public class Program16 {
	public static void main(String[] args) {
		int[] arr1={10,20,30,40,50};
		int[] arr2={1000,500,100,200,300};
		int[] mergeArr=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length+arr2.length;i++)
		{
			if(i<arr1.length)
			{
				mergeArr[i]=arr1[i];
			}
			else
			{
				mergeArr[i]=arr2[i-arr1.length];
			}
		}
		for(int i:mergeArr)
		{
			System.out.print(i+" ");
		}
	}
}
