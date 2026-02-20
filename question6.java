import java.util.Scanner;

public class question6 {
  public static int evenSum(int[] A, int index) {
    if (index < 0) {
      return 0;
    }
    
    int add = (A[index] % 2 == 0) ? A[index] : 0;

    return add + evenSum(A, index - 1);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many integers? ");
    int n = scanner.nextInt();

    int[] A = new int[n];

    System.out.println("Enter " + n + " integers: ");
    for (int i = 0; i < n; i++) {
      A[i] = scanner.nextInt();
    }

    int result = evenSum(A, n - 1);
    System.out.println("Even integers sum: " + result);

    scanner.close();
  }
}
