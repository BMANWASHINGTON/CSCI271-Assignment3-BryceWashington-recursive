/*************************************************************
Project 3 for CSCI 271-001 Spring 2026

Author: Bryce Washington
OS: Ubuntu Debian Linux 21.1
Compiler: javac 25.0.1
Date: February 21, 2026

Purpose: The purpose of this function is to read a string and
         recusrively return the length of a string.
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
            char c - characyer to count
            int i - current index being processed

Pre: s must be a valid string
     i must be between 0 and s.length()

Post: returns the number of occurrencees of c in s

Returns: An integer count of occurences

Called by: main

Calls: charCount (recursive call)
************************************************************************/
import java.util.Scanner;

public class question2{
  public static int charCount(String s, char c) {
    if (s.equals("")) {
      return 0;
    }

    int firstCount = (s.charAt(0) == c) ? 1 : 0;

    return firstCount + charCount(s.substring(1), c);
  }

/*****************************<main>***************************************
Description: reads a string from the user and prints its length using 
             the recursive function recursiveLength

Parameters: n/a

Pre: enter a valid string

Post: prints the length of the string

Returns: (void)

Called by: JVM runtime

Calls: recursiveLength
************************************************************************/

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a string: ");
    String S = scanner.nextLine();

    System.out.print("Enter a character: ");
    String input = scanner.nextLine();
    char C = input.charAt(0);

    int occur = charCount(S, C);
    System.out.println("Number of times: '" + C + "' occurs in S: " + occur);

    scanner.close();
  }

}
