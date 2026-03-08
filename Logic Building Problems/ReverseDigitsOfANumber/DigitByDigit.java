package ReverseDigitsOfANumber;

import java.util.Scanner;

public class DigitByDigit {
  static int reverse(int n) {
    int rev = 0;
    while (n > 0) {
      int last = n % 10;
      rev = rev * 10 + last;
      n /= 10;
    }
    return rev;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a Number to reverse its digits: ");
    int n = s.nextInt();
    System.out.println("Reversed Number " + reverse(n));
    s.close();
  }
}
