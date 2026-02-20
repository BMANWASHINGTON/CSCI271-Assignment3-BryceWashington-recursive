import java.util.Scanner;

public class question5 {
  public static String backwards(String s) {
    if (s.length() <= 1) {
      return s;
    }
    
    return backwards(s.substring(1)) + s.charAt(0);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String S = scanner.nextLine();

    String reverse = backwards(S);
    System.out.println("Reverse string: " + reverse);

    scanner.close();
  }

}
