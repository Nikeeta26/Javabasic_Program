package nikeeta;

import java.util.*;
import java.util.Map.Entry;

public class distrinctValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n ="nikeetakaudare";
		char[] arr = n.toCharArray();
		 HashMap<Character,Integer> m = new HashMap<>();
		 
		 for(char c : arr) {
			 if(m.containsKey(c)) {
				 m.put(c, m.get(c)+1);
				 
			 }
			 else {
				 m.put(c,1);
			 }
		 }
		 
		 System.out.println("Distinct characters and their counts:"+m);
		 
	        for (HashMap.Entry<Character, Integer> entry : m.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        
	        
	        
	        
	        
	        String s = "hello nikeeta hi";
	        char[] c = s.toCharArray();
	        
	        Map<Character,Integer> M = new HashMap<>();
	        for(char e : c) {
	        	if(M.containsKey(e)) {
	        		M.put(e,M.get(e)+1);
	        		
	        	}
	        	else {
	        		M.put(e,1);
	        	}
	        }
	       
	        
	        for(Map.Entry<Character,Integer> entryset:M.entrySet()) {
	        	if(entryset.getValue()!=1) {
	        		System.out.println(entryset);
	        	}
	        	//System.out.println(entryset);
	        }
	        
	        
	        
	        
	   
	        
	        
	        String a = "nik";
	        String b= "nik";
	        System.out.println(a==b);
	        b = "nikeeta";
	        System.out.println(a==b);
	        
	        
	        List<String> list = new ArrayList<>();
                 list.add("nik");
                 list.add("nik");
                 list.add("nik");
                 list.add("nik");
	        list.forEach(System.out::print);
	        
	}

}
