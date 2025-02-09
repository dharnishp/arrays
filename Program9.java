/*
Write A Java Program to find the duplicate number on a given integer array?
*/

package com.dharnish.arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
public class Program9 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr =new int[n];
		LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap();
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(lhm.containsKey(arr[i]))
			{
				lhm.put(arr[i], lhm.get(arr[i])+1);
			}
			else
			{
				lhm.put(arr[i], 1);
			}
		}
		Set<Integer> s=lhm.keySet();
		for(int i:s)
		{
			if(lhm.get(i)>1)
			{
				System.out.print(i+" ");
			}
		}
	}
}
