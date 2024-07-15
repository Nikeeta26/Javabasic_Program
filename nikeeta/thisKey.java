package nikeeta;

class demo
{
	int a;
	demo(){
		System.out.println("this i parent");
	}
	demo(int a){
		
		this();
		System.out.println(a);
		
	}
    void method1()
		{
    	
		      System.out.println("I am method 1");
		}
      void method2()
		{
    	  this.method1();
				System.out.println("I am method 2");
				
				this.method1();
		}
}

//statis block

class A1
{
	static
	{
	    System.out.println("I am static block");
	}
public void display()
	{
	   System.out.println("Display method");
	}
}



public class thisKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,5,6,9};
		  System.out.println(arr);
 demo s = new demo(5);
A1 a = new A1();
s.method2();
	}

}
