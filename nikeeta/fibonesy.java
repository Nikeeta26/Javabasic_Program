package nikeeta;

public class fibonesy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 	    
	    int p = 0;
		int q = 1;
		int r = 1;

		for (int i = 1; i <=10; i++) {
			System.out.print(p + ", ");

            p = q;
			q = r;
			r = p + q;
			
			
			
		}
		
		// or 
		int n1=0,n2=1,n3;
		int count =10;
		System.out.println("\n"+n1+" "+n2);
	

		
		for(int i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		
	}

}
