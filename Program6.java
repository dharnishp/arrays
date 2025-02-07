package arrayInterviewQuestions;

import java.util.LinkedHashSet;
import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		LinkedHashSet<Integer> lhs=new LinkedHashSet();
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
			lhs.add(arr[i]);
		}
		for(int i=1;i<=100;i++)
		{
			if(lhs.contains(i))
			{
				continue;
			}
			else
			{
				System.out.print(i+" ");
			}
		}
	}

}
