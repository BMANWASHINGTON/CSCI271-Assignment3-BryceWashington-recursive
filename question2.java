import java.util.Scanner;

public class question2{
  public static int charCount(String s, char c) {
    if (s.equals("")) {
      return 0;
    }

    int firstCount = (s.charAt(0) == c) ? 1 : 0;

    return firstCount + charCount(s.substring(1), c);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a string: ");
    String S = scanner.nextLine();

    System.out.print("Enter a character: ");
    String input = scanner.nextLine();
    char C = input.charAt(0);

    int occur = charCount(S, C);
    System.out.println("Number of times: '" + C + "' occurs in S: " + occur);

    scanner.close();
  }

}
