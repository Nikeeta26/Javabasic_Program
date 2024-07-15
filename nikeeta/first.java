package nikeeta;

import java.util.Scanner;

class data {
	int a =9 ;
	 int show() {
		//System.out.println(a+"data print");
		return a;
	}
}
public class first {


		public static void main(String[] args)
		{
			
			String str1="hello";
			String str2="HELLO";
			System.out.println(str1.equals(str2));
			int arr[][]=new int[2][2];
			int i,j;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the array elements");
			for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
					arr[i][j]=sc.nextInt();
				}
				}
			System.out.println("Array elements are:");
			for(i=0;i<2;i++)
			{
					for(j=0;j<2;j++)
					{
					   System.out.print(arr[i][j]);
					}
			}
		
		 
	}

}
