/********************************************************************************************************************
Project 3 for CSCI 271-001 

Author: Bryce Washington
OS: Ubuntu Debian Linux 21.1
Compiler: javac 25.0.1
Date: February 22, 2026

Purpose: This program reads a string and displays it backwards.
********************************************************************************************************************/
/*************************************************************
I declare and confrim the follwing
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

/*****************************<backwards>********************************
Description: Reads a string of integers s and recursively reads it backwards

Parameters: String s - string to reverse

Pre: s must be a valid string

Post: returns the reversed string

Returns: the reversed string

Called by: main

Calls: backwards (recursive function)
************************************************************************/
import java.util.Scanner;

// Returns the reverse of s
public class question5 {
  public static String backwards(String s) {
    if (s.length() <= 1) { // Base case: if s is empty or one character
      return s;
    }
    
    // Recursive case: reverse the substring from index 1 ato end, the append the first character
    return backwards(s.substring(1)) + s.charAt(0);
  }
/******************************<main>************************************
Description: Reads a string from the user and prints the reversed

Parameters: n/a

Pre: Enter a valid string

Post: Reversed strign is printed 

Returns: n/a (void)

Called by: JVM runtime

Calls: backwards
************************************************************************/
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: "); // User asked to enter string
    String S = scanner.nextLine(); // String is initialized and recieves input

    String reverse = backwards(S); // Calls backwards() function
    System.out.println("Reverse string: " + reverse); // Prints reversed string

    scanner.close();
  }

}
