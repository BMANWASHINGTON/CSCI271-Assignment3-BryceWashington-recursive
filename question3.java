/********************************************************************************************************************
Project 3 for CSCI 271-001 

Author: Bryce Washington
OS: Ubuntu Debian Linux 21.1
Compiler: javac 25.0.1
Date: February 22, 2026

Purpose: This program reads integers in a stored array and finds the maximum integer in a recursive function.
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
/***********************<max>************************************
Description: Finds the max value in the first n elements of array A

Parameters: int[] A - array of integers
            int n - number of elements

Pre: A must be initialized
     n >= 1

Post: returns the maximum integer in A[0...n-1]

Returns: the maximum integer

Called by: main

Calls: max (recursive call)
************************************************************************/
import java.util.Scanner;

public class question3 {
  // Recursive function to find the maximum of array A[0...n-1]
  public static int max(int[] A, int n) {
    // Base case: if n = 1
    if (n == 1) {
      return A[0];
    }
    // Recursive case: max of first n-1 elements
    int restofMax = max(A, n-1);
    // Compares last element with rest of elements
    return (A[n-1] > restofMax) ? A[n-1] : restofMax;
  }

/********************************<main>*****************************************
Description: Calls on max function to read integers and find the max value

Parameters: n/a

Pre: User enters number of integers and interger values

Post: returns the maximum integer value

Returns: n/a (void)

Called by: JVM runtime

Calls: max

**************************************************************************/
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many integers are there?: ");
    int n = scanner.nextInt(); // User enters number of integers for array

    int[] A = new int[n]; // New array created

    System.out.println("Enter " + n + " integers: ");
    for (int i = 0; i < n; i++) { // Base case: if i = 0
      A[i] = scanner.nextInt();
    }

    int Max = max(A, n); // Calls max function
    System.out.println("Max value: " + Max); // Prints max value

    scanner.close();

  }

}
