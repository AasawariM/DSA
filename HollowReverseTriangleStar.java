public class HollowReverseTriangleStar {
  public static void main(String[] args) {
    int n = 5;
    for (int i = n; i >= 1; i--) {

      // for pritnting space
      for (int j = 1; j <= n - i; j++) {

        System.out.print(" ");
      }
      // for stars
      for (int j = 1; j <= i; j++) {

        // i==n for top border
        // j==1 for left border
        // j==i for right border

        if (i == n || j == 1 || j == i) {
          System.out.print("* ");
        } else {
          // 2 spaces
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
