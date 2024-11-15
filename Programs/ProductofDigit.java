package nikeeta;

public class ProductofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n = 2345;
      int res = 1;
      while(n>0) {
    	  res = res*(n%10);
    	  n = n/10;
      }
      System.out.println(res);
      
	}

}
