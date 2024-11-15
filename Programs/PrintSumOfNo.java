package nikeeta;

public class PrintSumOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 22299;
int res = 0;
while(n>0) {
	res = res+(n%10);
	n = n/10;
}
System.out.println(res);
	}

}
