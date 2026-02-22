/*************************************************************
Project 3 for CSCI 271-001 Spring 2026

Author: Bryce Washington
OS: Ubuntu Debian Linux 21.1
Compiler: javac 25.0.1
Date: February 21, 2026

Purpose: The purpose of this function is to read a string and a
         single character & display the number of times it occurs
         in string S. 
*************************************************************/
/*************************************************************
I declare and confrim the following:
  - I have not discussed this porgram code with anyone other
  than my instructor or the teaching assistants assigned to
  this course.
  - I have not used programming code obtained from someone
  else, or any unauthorized sources, including the Internet,
  either modified or unmoodified.
  - If any source code or documentation used in my program was
  obtained from other sources, like a textbook or course notes,
  I have clearly indicated that with a proper citation in the 
  comments of my program.
  - I have not designed this program in such a way as to defeat
  or interfere with the moral oepration of the supplied grading
  code.

<Bryce Washington>
*************************************************************/

/***********************<charCount>************************************
Description: Recursively counts how many times character c appears in string s

Parameters: String s - the string 
            char c - character to count
            int i - current index being processed

Pre: s must be a valid string
     i must be between 0 and s.length()

Post: returns the number of occurrencees of c in s

Returns: An integer count of occurences

Called by: main

Calls: charCount (recursive call)
************************************************************************/
import java.util.Scanner;

//Recursive function to count occurrences of c in s
public class question2{
  public static int charCount(String s, char c) {

    // Base case: if the string is empty
    if (s.equals("")) {
      return 0;
    }
    
    //Checks first character
    int firstCount = (s.charAt(0) == c) ? 1 : 0;

    // Recurse the rest of the string
    return firstCount + charCount(s.substring(1), c);
  }

/*****************************<main>***************************************
Description: reads a string and character from the user and pritns the 
             number of times the character appears in the string using 
             the recursive function charCount()

Parameters: n/a

Pre: enter a valid string and single character

Post: prints the number of occurrences of C in S

Returns: (void)

Called by: JVM runtime

Calls: charCount
************************************************************************/

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a string: "); // User asked to enter string
    String S = scanner.nextLine(); // String recieves input

    System.out.print("Enter a character: "); // User aksed to enter character
    String input = scanner.nextLine(); // Character is stored
    char C = input.charAt(0); // Checks for that specific character

    int occur = charCount(S, C); // Calls charCount() function
    System.out.println("Number of times: '" + C + "' occurs in S: " + occur); // Prints the number of occurrences

    scanner.close();
  }

}
