package nikeeta;

public class convertFirstcharInUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s = "nikeeta kuadare";
		
	      
	        String words[] = s.split(" ");
	        String capitalizedSentence = "";

	        for (int i = 0; i < words.length; i++) {
	            // Capitalize the first letter of each word
	            String capitalizedWord = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
	            
	            // Append the capitalized word to the result sentence
	            capitalizedSentence = capitalizedSentence + capitalizedWord;

	            // Append a tab space after each word, except the last one
	            if (i < words.length - 1) {
	                capitalizedSentence += "\t";
	            }
	        }

	        System.out.println(capitalizedSentence);
	        
	      
	        
	        for(int i=0; i<words.length;i++) {
	        	String capital = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
	        	capitalizedSentence = capitalizedSentence + capital;
	        	if(i<words.length-1) {
	        		capitalizedSentence+="\t";
	        	}
	        }
	        
	        System.out.println(capitalizedSentence);
	        
	        

	}

}
