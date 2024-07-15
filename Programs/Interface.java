package nikeeta;

interface test{
	 void show();
}
interface ok extends test{
	void test(); 
}
public class Interface implements ok {
	public void show() {
		System.out.println("test interface");
	}
	
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("ok method ");
	}  
	
	public static void main(String args[])
	{
		Interface a = new Interface();
		a.show();
		a.test();
		
	}


	
	
	
}

