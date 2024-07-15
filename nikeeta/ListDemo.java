package nikeeta;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list = new ArrayList<Integer>(); 
         
		 list.add(5);
		 list.add(5);
		 list.add(5);
		 list.add(5);
		 list.add(5);
		 list.add(5);
		 list.set(5,7);
		 System.out.println(list);
		 System.out.println(list.get(5));
         for(int n : list) {
        	 System.out.println(n);
         }
		 
         List<String> l = new ArrayList<String>();
         
         
         
         /// add two list
         // Create list1
         List<String> list1 = new ArrayList<>();
         list1.add("Apple");
         list1.add("Banana");
         list1.add("Orange");
         
         // Create list2
         List<String> list2 = new ArrayList<>();
         list2.add("Grapes");
         list2.add("Pineapple");
         
         // Merge list2 into list1
         list1.addAll(list2);
         
         // Print the merged list
         System.out.println("Merged List: " + list1);
	}

}
