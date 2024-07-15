package nikeeta;

import java.util.Scanner;

public class sumNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the no");
int n = sc.nextInt();
int sum = 0;
int j=1;
//for(int i=1; i<=n; i++)
//{
//	System.out.println("enter the no");
//	int num = sc.nextInt();
//	sum = sum+num;
//	
//}
//System.out.println(sum);
//int avg = sum/n;
//System.out.println(avg);

while(j<=n) {
	int num = sc.nextInt();
	sum = sum+num;
	j++;
}

System.out.println(sum);
int avg = sum/n;
System.out.println(avg);
	}

}
