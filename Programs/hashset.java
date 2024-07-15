package nikeeta;

import java.util.*;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashSet<Integer> hash = new HashSet<Integer>();
  hash.add(4);
  hash.add(5);
  hash.add(6);
  hash.add(8);
  
  for(int i: hash) {
	  System.out.println(i);
  }
  
  Iterator<Integer> i = hash.iterator();
  while(i.hasNext()) {
	  System.out.println(i.next());
  }
  
	}

}
