
// Efficient Approach 
// Using Bitwise AND Operator 

import java.util.Scanner;

public class EvenOrOddBitwise {
  public static boolean isEven(int n) {
    // bitwise & oeprator for n & 1
    return (n & 1) == 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    System.out.println(isEven(n));
    sc.close();
  }
}

// Example:
// 15 in binary = 1111
// 1 in binary = 0001
// ---------------------
// 15 & 1 = 0001 (1)

// Since result is 1, number is odd.
