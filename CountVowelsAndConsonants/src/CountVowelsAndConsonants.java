/*****************************************************
* Name: Feras
* Description: A program that takes users input and displays what are
* the vowels and what are consonants alphabets.
 ***************************************************/

//import
import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args){
        //create scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt user to enter a string
        System.out.println("Enter a string: ");
        
        //declare a String object to store user input
        String userInput = input.nextLine();
        userInput = userInput.toUpperCase();
        
        //declare Vowel variable to store the number of vowels
        int vowel = 0;
        //declare Consonant variable to store the number of consonant
        int consonant = 0;
        
        //declare integer counter vairbale to use in the loop and check index
        int counter = 0;
       
        while( counter < userInput.length() ){ // Declare a While loop
            
           //Declare a character to check each character suing loop and counter
            char ch = userInput.charAt(counter); 
            
             //counter vairable for the characters to check each index
            counter++;
            
            // If statement to check the character of the user's String
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                 
                //increment vowel counter by 1 to display the user no. of vowels
                ++vowel;
            }//end if
            
            else  {
                // check if not vowel then its a consonant
                if((ch >= 'A' && ch <= 'Z')) {
                    
                //increment the consonant counter by 1 to display it to user
                ++consonant;
                }//end if
            }//end else
            
        }// end while loop
        
        //Display the number if Vowels and Consonants to user
        System.out.println("The number of vowels is: " + vowel);
        System.out.println("The number of consonants is: " + consonant);
        
    }//end main
}//end class
