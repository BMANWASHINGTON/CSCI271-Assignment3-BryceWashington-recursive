/********************************************************************************************************************
Project 3 for CSCI 271-001 

Author: Bryce Washington
OS: Ubuntu Debian Linux 21.1
Compiler: javac 25.0.1
Date: February 22, 2026

Purpose: This program reads a list of integers and stores them into an array. Then, it returns the shum of all even integers recursively.
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

/***************************<evenSum>************************************
Description: Recursively computes the sum of all even integers in array A.

Parameters: int[] A - array of integers
            int index - current index 

Pre: A must be initialized
     index has to be between -1 and A.length - 1

Post: returns the sum of all even integers in A[0...index]

Returns: integer sum of even valeus

Called by: main

Calls: evenSum (recursive function)
************************************************************************/
import java.util.Scanner;

// Recursive function to add even numbers
public class question6 {
  public static int evenSum(int[] A, int index) {
    // Base case: if the index is less than 0
    if (index < 0) {
      return 0;
    }
    
    // Checks if element is even 
    int add = (A[index] % 2 == 0) ? A[index] : 0;

    // Recurse on the rest of the array
    return add + evenSum(A, index - 1);
  }

/******************************<main>************************************
Description: Reads a list of integers, stores them into an array, and 
             prints the sum fo all even integers using evenSum().

Parameters: n/a

Pre: Enter a valid number of integers

Post: Sum of all even integers in the array is printed

Returns: n/a (void)

Called by: JVM runtime

Calls: evenSum()
************************************************************************/
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many integers? "); // User asked how many integers
    int n = scanner.nextInt(); // Number of integers

    int[] A = new int[n]; // Array for stored integers

    System.out.println("Enter " + n + " integers: "); // User asked to enter integers
    for (int i = 0; i < n; i++) { // Initializes count
      A[i] = scanner.nextInt(); // Integers ares stored into array
    }

    int result = evenSum(A, n - 1); // Calls evenSum()
    System.out.println("Even integers sum: " + result); // Prints out sum

    scanner.close();
  }
}
