package SumOfDigits;

import java.util.Scanner;

public class SumOfDigitsRecursion {
  public static int sumOfDigits(int n) {
    if (n == 0) { // base case
      return 0;
    }
    // recursive case:
    // add last digit and call function on remaining number
    return (n % 10) + sumOfDigits(n / 10);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int n = Math.abs(s.nextInt()); // If the number entered is negative
    System.out.println("Sum of Digits of " + n + " is " + sumOfDigits(n));
    s.close();
  }
}
