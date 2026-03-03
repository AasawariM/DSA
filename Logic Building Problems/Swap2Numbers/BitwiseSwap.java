package Swap2Numbers;

public class BitwiseSwap {
  public static void main(String[] args) {
    // bitwise XOR (Works only for numbers)
    // An XOR (Exclusive OR) gate outputs true (1) only when its inputs differ (one
    // is 1, the other is 0) and false (0) when they are the same.
    int a = 2;
    int b = 4;
    System.out.println("Before Swap: " + a + "," + b);
    // 2=0010 and 4=0100
    a = a ^ b; // 0010 ^ 0100 = 0110 , a = 6
    b = a ^ b; // 0110 ^ 0100 = 0010 , b = 2
    a = a ^ b; // 0110 ^ 0010 = 0100 , a = 4
    System.out.println("After Swap: " + a + "," + b);
  }
}
// XOR swap = It reduces readability and gives no real performance benefit. Use
// temp variable instead.