import java.util.Scanner;
	 
	public class Pro3_150120526 {
		
		public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter a letter: ");
            String letter = input.nextLine();
            letter = letter.toUpperCase();	// Make letter to upper case
            
            if (letter.length() >= 2) {
                    System.out.println("Invalid Input !");   // Invalid input more than 1 letter                
            }
            else {
                    char L = letter.charAt(0);	// Printing A
                    printDiamond(L);
            }
    }

	        public static void printDiamond (char letter) {		// Printing diamond shape method
	           
	        	char[] letters = new char[26];
	               int count = 0;
	                for(char k = 'A'; k < 'Z'; k++) {
	                	letters[count] = k; 
	                	count++;
	                }
	                int lengthN = 0;
	            String[] alphabet = new String[26];
	         
	            for (int i = 0; i < letters.length; i++) { // Finding the length.
	                if (letters[i] == letter) {
	                        lengthN = i;
	                    break;
	                }
	            }
	            
	            for (int i = 0; i <= lengthN; i++) {  // Making diamonds
	            	alphabet[i] = " ";
	                
	                for (int j = 0; j < lengthN - i; j++)  // Making first dots
	                	alphabet[i] += ".";
	              	                	                
	                alphabet[i] += letters[i];  // Making the letters
	                    
	              
	                if (letters[i] != 'A') {   // Making spaces between letters
	                	
	                        for (int j = 0; j < 2 * i - 1; j++) 
	                        	alphabet[i] += ".";
	            	                    
	                        alphabet[i] += letters[i];
	                } 
	            
	                System.out.print(alphabet[i]);    // Drawing the first part of the diamond
	                
	                for (int k = 0; k < lengthN; k++)            	                		
                		alphabet[k] += ".";
	                System.out.println();
	                	
	            } 
	            
	            for (int i = lengthN - 1; i >= 0; i--)	
	            		System.out.println(alphabet[i]);    // Drawing the second part of the diamond
	             
	        }
	        
	}

