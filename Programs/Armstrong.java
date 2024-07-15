package nikeeta;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1;
int s=0;
int r;
int temp = n;

while(n>0) {
	r=n%10;
	s=(r*r*r)+s;
	n=n/10;
}
if(temp == s) {
	System.out.println(" the no. armstrong");
}
else {
	System.out.println(" the not arm");
}
	}

}
