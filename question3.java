import java.util.Scanner;

public class question3 {
  public static int max(int[] A, int n) {
    if (n == 1) {
      return A[0];
    }
    
    int restofMax = max(A, n-1);

    return (A[n-1] > restofMax) ? A[n-1] : restofMax;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many integers are there?: ");
    int n = scanner.nextInt();

    int[] A = new int[n];

    System.out.println("Enter " + n + " integers: ");
    for (int i = 0; i < n; i++) {
      A[i] = scanner.nextInt();
    }

    int Max = max(A, n);
    System.out.println("Max value: " + Max);

    scanner.close();

  }

}
