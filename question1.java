import java.util.Scanner;

public class question1 {
  public static int recursiveLength(String s) {
    if (s.equals("")) {
      return 0;
    }
    return 1 + recursiveLength(s.substring(1));
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String S = scanner.nextLine();

    int length = recursiveLength(S);
    System.out.println("String length: " + length);

    scanner.close();
  }
}
