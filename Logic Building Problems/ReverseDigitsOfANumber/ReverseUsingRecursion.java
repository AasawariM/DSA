package ReverseDigitsOfANumber;

import java.util.Scanner;

public class ReverseUsingRecursion {
  public static int reverseRecursion(int n, int rev) {
    if (n == 0) {
      return rev;
    }

    return reverseRecursion(n / 10, rev * 10 + n % 10);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a Number to reverse its digits: ");
    int n = s.nextInt();
    System.out.println(reverseRecursion(n, 0));
    s.close();
  }
}
