// Native approach

import java.util.Scanner;

public class EvenOrOddModulo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    if (n % 2 == 0) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
    sc.close();
  }
}