package SumOfDigits;

import java.util.Scanner;

public class DigitExtraction {
  public static int sumOfDigits(int n) {
    int sum = 0;
    while (n != 0) {
      // extract each digit from last one by one using % 10
      int digit = n % 10;
      // add this last digit to sum
      sum += digit;
      // remove digit from the number
      n /= 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int n = Math.abs(s.nextInt()); // If the number entered is negative
    System.out.println("Sum of Digits of " + n + " is " + sumOfDigits(n));
    s.close();
  }
}
