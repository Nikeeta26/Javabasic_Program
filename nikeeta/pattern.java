package nikeeta;

public class pattern {

	public static void main(String[] args) {
	
		        int levels = 5; // Number of levels in the pyramid
		        
		        // Outer loop for number of rows (levels)
		    for (int i = 1; i <= levels; i++) {
		            
		            // Inner loop for spaces before the characters
		            for (int j = levels - i; j > 0; j--) {
		                System.out.print(" ");
		             }
		            
		            // Inner loop for characters in each row
		            for (int k = 1; k <= 2 * i - 1; k++) {
		                //System.out.print((char) ('A' + i - 1)); // Assuming 'A' as the base character
		                System.out.print (i);
		            }
		            
		            // Move to the next line after each row
		            System.out.println();
		        }
		    
		    
		    // one side piramid
				    for (int i = 1; i <= levels; i++) {
				            
				            // Inner loop for characters in each row
				            for (int k = 1; k <=i; k++) {
				                //System.out.print((char) ('A' + i - 1)); // Assuming 'A' as the base character
				                System.out.print ("*");
				            }
				            
				            // Move to the next line after each row
				            System.out.println();
				        }
		    
				    
				    
				    for (int i = levels; i >=0; i--) {
			            
			            // Inner loop for characters in each row
			            for (int k = 1; k <=i; k++) {
			                //System.out.print((char) ('A' + i - 1)); // Assuming 'A' as the base character
			                System.out.print ("*");
			            }
			            
			            // Move to the next line after each row
			            System.out.println();
			        }
	    
	
	
	 // space one side piramid
				    
				    for (int i = 0 ; i <levels ; i++) {
			            
			            // Inner loop for spaces before the characters
			            for (int j = levels - i; j > 0; j--) {
			                System.out.print(" ");
			             }
			            
			            // Inner loop for characters in each row
			            for (int k = 1; k <=i; k++) {
			                //System.out.print((char) ('A' + i - 1)); // Assuming 'A' as the base character
			                System.out.print ("*");
			            }
			            
			            // Move to the next line after each row
			            System.out.println();
			        }
				    
				    
                    for (int i = 0 ; i <levels ; i++) {
			            
			            // Inner loop for spaces before the characters
			            for (int j = levels - i; j > 0; j--) {
			                System.out.print(" ");
			             }
			            
			            // Inner loop for characters in each row
			            for (int k = 1; k <=levels; k++) {
			                //System.out.print((char) ('A' + i - 1)); // Assuming 'A' as the base character
			                System.out.print ("*");
			            }
			            
			            // Move to the next line after each row
			            System.out.println();
			        }
                    
                    
                
          // empty space 
           int n=7;
                    for (int i = 0; i < n; i++) {
                        //  inner loop to handle number of columns
                        for (int j = 0; j < n; j++) {
                        
                            if (i == 0 || j == 0 || i == n - 1
                                || j == n - 1) {
                                System.out.print("*");
                            }
                            // otherwise print space only.
                            else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    
  // number increase peramid
                    
        for(int i=0;i<n;i++) {
        	
        	for(int j=0;j<i;j++) {
        		System.out.print(j);
        	}
        	System.out.println();
        }
			
      for(int i=0;i<n;i++) {
        	
    		for(int k=n-i;k>0;k--) {
    			System.out.print(" ");
    		}
        	for(int j=0;j<i;j++) {
        		System.out.print(j);
        	}
        	System.out.println();
        }
      
      
			
      
      for(int i=0;i<n;i++) {
      	
  		for(int k=n-i;k>0;k--) {
  			System.out.print(" ");
  		}
      	for(int j=0;j<2*i-1;j++) {
      		System.out.print("*");
      	}
      	System.out.println();
      	
      }
      for(int i=levels;i>0;i--) {
        	
    		for(int k=n-i;k>0;k--) {
    			System.out.print(" ");
    		}
        	for(int j=0;j<2*i-1;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        	
        }
  			
       
      int num =1;
      for(int i=0;i<levels;i++) {
        	
        	for(int j=0;j<i;j++) {
        		System.out.print(num);
        		num++;
        	}
        	System.out.println();
        	
        }
  		
      
      for(int i=0;i<n;i++) {
        	
        	for(int j=0;j<i;j++) {
        		if((i+j)%2==0) {
        			System.out.print(1);
        		}
        		else {
        			System.out.print(0);
        		}
        		
        	}
        	System.out.println();
        	
        }
      
      for(int i=1;i<=levels;i++) {
    	  
      	for(int k=levels-i;k>0;k--) {
      		System.out.print(" ");
      	}
      	for(int j=i;j>=1;j--) {
      		System.out.print(j);
      		
      	}
      	for(int j=2;j<=i;j++) {
      		System.out.print(j);
      		
      	}
      	
      	System.out.println();
      	
      }
		
      
      for(int i=1;i<=levels;i++) {
    	  
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        		
        	}
        	
        	for(int k=2*(levels-i);k>0;k--) {
        		System.out.print(" ");
        	}
        	 for (int j = 1; j <= i; j++) {
                 System.out.print("*");
             }
        	
        	System.out.println();
        	
        }
  		
      
      for(int i=levels;i>0;i--) {
    	  
    	  for(int k=levels-i;k>0;k--) {
        		System.out.print(" ");
        	}
    	  
      	for(int j=0;j<i;j++) {
      		System.out.print("*");
      		
      	}
      	System.out.println();
      	
      }

		
      for (int i = 0 ; i<levels ; i++) {
          
          // Inner loop for spaces before the characters
          for (int j=0;j<i;j++) {
              System.out.print(" ");
           }
          
          // Inner loop for characters in each row
          for (int k =n;k>0 ;k--) {
              //System.out.print((char) ('A' + i - 1)); // Assuming 'A' as the base character
              System.out.print (k);
          }
          
          // Move to the next line after each row
          System.out.println();
      }
      
      
      
      for(int i=1;i<=levels;i++) {
    	  
      	for(int j=1;j<=i;j++) {
      			System.out.print("*");
      		
      	}
      	
      	for(int k=2*(levels-i);k>0;k--) {
      		System.out.print(" ");
      	}
      	 for (int j = 1; j <= i; j++) {
               System.out.print("*");
           }
      	
      	System.out.println();
      	
      }
      for(int i=levels; i>0; i--) {
    	  
        	for(int j=1;j<=i;j++) {
        			System.out.print("*");
        		
        	}
        	
        	for(int k=0; k<2*(levels-i);k++) {
        		System.out.print(" ");
        	}
        	 for (int j = 1; j <= i; j++) {
                 System.out.print("*");
             }
        	
        	System.out.println();
        	
        }
		
    
  for(int i=levels;i>0;i--) {
    	  
    	  for(int k=levels-i;k>0;k--) {
        		System.out.print(" ");
        	}
    	  
      	for(int j=0;j<i;j++) {
      		System.out.print("*");
      		
      	}
      	System.out.println();
      	
      }

      
	}
}
    
