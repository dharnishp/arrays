package arrayInterviewQuestions;
import java.util.Arrays;
import java.util.Scanner;

public class Program20
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
		System.out.println("enter k value");
		int k=scn.nextInt();
		/*int temp=0;
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
		}*/
		Arrays.sort(arr);
		System.out.println(k +" Maximum element of an array : "+arr[arr.length-k]);
		System.out.println(k+" Minimum element of an array : "+arr[k-1]);
	}
}