public class SolidRectangle {

  public static void main(String[] args) {
    int i, j;
    // nested loop
    // outer loop
    for (i = 1; i <= 4; i++) { // for row

      // inner loop
      for (j = 1; j <= 5; j++) { // for column
        System.out.print("*"); // same line print star
      }
      System.out.println(); // for next line
    }
  }
}
