/********************************************************************************************************************
Project 3 for CSCI 271-001 

Author: Bryce Washington
OS: Ubuntu Debian Linux 21.1
Compiler: javac 25.0.1
Date: February 22, 2026

Purpose: This program reads an integer & a single digit and counts how many times that digit appears.
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

/****************************<digitCount*************************************
Description: Counts how many times digit D appears in number N.

Parameter: long N - number to search
           int D - the digit to count

Pre: N must be a valid long integer
     D msut be a single digit (0-9)

Post: reutrns the number of occurrences of D in N

Returns: the integer count of appearances 

Called by: main

Calls: digitCount
****************************************************************************/
import java.util.Scanner;

// Recursive functin to coutn digit D in number N
public class question4 {
  public static int digitCount(long N, int D) {
    if (N == 0) { // Base case: if N = 0
      return 0;
    }
    
    // Checks last digit
    int lastD = (int)(N % 10);
    int thisdigitCount = (lastD == D) ? 1 : 0;

    // Recurse on rest of the number
    return thisdigitCount + digitCount(N / 10, D);
  }

/********************************<main>***********************************
Description: Reads a long intger N and a integer D from the user and 
             prints the number of times D appears in N using the 
             recursive function digitCount.

Parameters: n/a

Pre: User enters a valid long integer and a single digit

Post: Number of appearances is printed

Returns: n/a (void)

Called by: JVM runtime

Calls: digitCount
*************************************************************************/
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    long N = scanner.nextLong(); // The long integer input

    System.out.print("Enter a digit (0-9): ");
    int D = scanner.nextInt(); // The number being searched

    int result = digitCount(N, D); // Calls digitCount function
    System.out.println("The number " + D + " appears " + result + " times. "); // Prints the number of appearances
    scanner.close();
  }
}
