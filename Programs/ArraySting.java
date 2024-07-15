package nikeeta;

public class ArraySting {
	public static void main(String[] args) {
		String str = "nikeeta kaudare";

		 char[] charArray = str.toCharArray();	
	        	 for (int i = charArray.length - 1; i >= 0; i--)
	        {
	        	System.out.print(charArray[i]);
	        }
	        	 
	        	 System.out.println();
	        	 
	        	 String[] s = str.split("");
	        	 for(int i=s.length-1;i>=0;i--) {
	        		 System.out.print(s[i]);
	        	 }
	        	
	        	 
	        	  
	   	      System.out.print("Original word: ");
	   	      System.out.println("Geeks"); //Example word
	   	      
	   	      String str1= "Geeks", nstr="";
	   		   
	   	      char ch;
	   	      
	   	      for (int i=0; i<str1.length(); i++)
	   	      {
	   	        ch= str1.charAt(i); //extracts each character
	   	        nstr= ch+nstr; //adds each character in front of the existing string
	   	      }
	   	      System.out.println("Reversed word: "+ nstr+"\t");
	}
}
