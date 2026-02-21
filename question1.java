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

/***********************<question 1>************************************
Description: Recursively computes the number of characters in a string S

Parameters: String s - the string of numbers being computed

Pre: s must be a valid, initialized string

Post: returns the number of character in string s

Returns: An integer representing the string's length

Called by: main

Calls: recursiveLength (recursive call)
************************************************************************/
import java.util.Scanner;

public class question1 {

  // Recursive function to compute string length
  public static int recursiveLength(String s) {
    // If string length = 0
    if (s.equals("")) {
      return 0;
    }
    //Recursive case: 1 (first char) + length of rest of the string
    return 1 + recursiveLength(s.substring(1));
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

    System.out.print("Enter a string: "); // User enters string
    String S = scanner.nextLine(); // Scanner recieves user input

    int length = recursiveLength(S); // Recursive function called on 
    System.out.println("String length: " + length); // Prints string length

    scanner.close();
  }
}
