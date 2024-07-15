package nikeeta;

import java.util.*;

public class palindron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
  int n = sc.nextInt();
int s=0;
int r;
int temp = n;
while(n>0) {
	r=n%10;
	s=(s*10)+r;
	n=n/10;
}
if(temp == s) {
	System.out.println("no is palindrom");
}
else {
	System.out.println("no is not palindrom");
}
	}

}
