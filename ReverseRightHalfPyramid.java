public class ReverseRightHalfPyramid {
  public static void main(String[] args) {

    int i, j;
    int n = 4;
    // simply revert outer loop condition to get reverse right half pyramid
    for (i = n; i >= 1; i--) {
      for (j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
