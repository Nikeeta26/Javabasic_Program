package nikeeta;

class demon
{
synchronized void show(int n)
{
for(int i=1;i<=5;i++)
{
System.out.println(n*i);
try
{
Thread.sleep(400);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
public class threadClass  implements Runnable{

	demo d; 
	threadClass(demo d){
		this.d = d;
	}
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("thread class"+Thread.currentThread().getName());
		System.out.println("thread 7899 class"+Thread.currentThread().getPriority());
	}
 public void show() {
	 System.out.println("thread class");
	
 }
	public static void main(String[] args) {
		 demon d = new demon();
		 d.show(5);
		threadClass t1 = new threadClass();
		threadClass t2 = new threadClass();
		//t1.setPriority(Thread.MAX_PRIORITY);
		//t1.show();
	    Thread T = new Thread(t1);
	    Thread T1 = new Thread(t1);
	  T.setPriority(8);
	  T1.setPriority(Thread.MIN_PRIORITY);
		T.run();
		T1.run();
		T.start();
		
		
		T.setName("Thread1");
		//T.getName();
		//T.start();
		System.out.println("Thread name="+T.getName());
		
	}
	
	}

