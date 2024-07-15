package nikeeta;

import java.text.SimpleDateFormat;
import java.util.*;

public class shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer[] array = {1, 2, 3, 4, 5};
	        
	        // Shuffle the array
	        List<Integer> list = Arrays.asList(array);
	        Collections.shuffle(list);
	        System.out.println(list);
	        
	        // Convert back to array (if needed)
	        list.toArray(array);
	        
	        // Print shuffled array
	      //  System.out.println(Arrays.toString(array));
	        
	        
	        
	        
	        //date print 
	        Date now = new Date();
	        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        String data = formater.format(now);
	        System.out.print(data);
	}
	

}
