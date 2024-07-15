package nikeeta;

import java.util.*;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 166.66;  
		//converting double data type into long data type  
		long l = (long)d;  
		//converting long data type into int data type  
		int i = (int)l;  
		
		double p = 8.9;
		int g = (int)p;
		System.out.println(g);
		
		System.out.println("Before conversion: "+d);  
		//fractional part lost  
		System.out.println("After conversion into long type: "+l);  
		//fractional part lost  
		System.out.println("After conversion into int type: "+i);  
		
   Map<Integer,String> m = new Hashmap<Integer,String>();
   
   m.put(1, "nik");
   m.put(2, "nik");
   m.put(3, "nik");
   m.put(4, "nik");
   m.put(5, "nik");
    System.out.println(m);
   
   for(Map.Entry k : m.entrySet()) {
	   System.out.println(k);
   }
   
   Hashmap<Integer,String> hash = new Hashmap<Integer,String>();
   
   hash.put(null, null);
   hash.put(2, "nikeeta");
   hash.put(2, null);
   hash.put(3, "sakshi");
   hash.put(4, "sneha");
   
   System.out.println(hash);
	}

}
