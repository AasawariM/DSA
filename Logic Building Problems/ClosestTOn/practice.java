//Given two integers n and m (m != 0). Find the number closest to n and divisible by m.
//  If there is more than one such number, then output the one having maximum absolute value.

package ClosestTOn;

public class practice {
  public static void main(String[] args) {
    int n = 13; // -15
    int m = 4; // 6
    // either be 12 or 16 but 12 is closest one less distance
    // we fill first find the quotient
    int q = n / m; // 13/4 = quotient is 3
    // first closest number we found is
    int n1 = q * m; // 3*4 = 12
    System.out.println(n1);
    // second closest number logic

    // n → can be positive or negative
    // m → can be negative mathematically
    // But in most coding problems m is assumed positive
    // if any of m or n could be negative we need to consider that as well
    int n2 = (m * n) > 0 ? m * (q + 1) : m * (q - 1); // 13*4 is positive so both numbers positive so,
    System.out.println(n2);

    // second closest number will be m*q+1 i.e 16
    // checking which one is closer out of n1 and n2
    // calculate distance and if same distance then maximum absolute will be the
    // closest one.
    if (Math.abs(n - n1) < Math.abs(n - n2)) { // 13-12 = 1 < 13-16 = 3
      System.out.println("closest is " + n1);
    } else if (Math.abs(n - n1) > Math.abs(n - n2)) {
      System.out.println("closest is " + n2);
    }
    // if distance is same check for highest absolute value between n1 and n2
    else {
      if (Math.abs(n1) > Math.abs(n2))
        System.out.println("D same Closest is " + n1);
      else
        System.out.println("D same Closest is " + n2);
    }
  }
}
