/*
 * Write A Java Program to print common elements between two arrays?
 */
package arrayInterviewQuestions;

public class Program15 {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50,60,70,80};
		int[] arr2= {10,20,30,60,70,90,100,200};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
}
