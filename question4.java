import java.util.Scanner;

public class question4 {
  public static int digitCount(long N, int D) {
    if (N == 0) {
      return 0;
    }
    
    int lastD = (int)(N % 10);
    int thisdigitCount = (lastD == D) ? 1 : 0;

    return thisdigitCount + digitCount(N / 10, D);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    long N = scanner.nextLong();

    System.out.print("Enter a digit (0-9): ");
    int D = scanner.nextInt();

    int result = digitCount(N, D);
    System.out.println("The number " + D + " appears " + result + " times. ");

    scanner.close();
  }
}
