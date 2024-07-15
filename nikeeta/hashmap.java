package nikeeta;

import java.util.*;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hashMap = new HashMap<String, Integer>();

		hashMap.put("David", 95);
		hashMap.put("Jane", 80);
		hashMap.put("Mary", 97);
		hashMap.put("Lisa", 78);
		hashMap.put("Dino", 65);
		hashMap.put("Dino", 0);
		
		 List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());	
		  Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue));
		  System.out.println(entryList);
		  
		  LinkedHashMap<String, Integer> sortedHashMap = new LinkedHashMap<>();
	        for (Map.Entry<String, Integer> entry : entryList) {
	            sortedHashMap.put(entry.getKey(), entry.getValue());
	        }
	        
	        
	        // Print the sorted HashMap by values (ascending)
	        System.out.println("Sorted HashMap by value (ascending):");
	        System.out.println(sortedHashMap);
	        
	        String s = "nikeeta";
	        for(int i =0; i<s.length();i++) {
	        	System.out.println(i);
	        }
		
	        
		
	        String example = """
	        	              Example text
	        	              i i am nik""";
	        System.out.println(example);
	        
	        
	        String s1 = "abc";
	        String s2 = "abc";

	        System.out.println("s1 == s2 is:" + s1 == s2);
	        
	        HashSet shortSet = new HashSet();

	    	for (short i = 0; i < 100; i++) {
	        shortSet.add(i);
	        shortSet.remove(i - 1);
	    }

	    System.out.println(shortSet.size());
	}

}
