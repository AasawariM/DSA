public class SolidRhombus {
  public static void main(String[] args) {
    int n = 4;
    for (int i = 1; i <= n; i++) {

      // for pritnting space
      for (int j = 1; j <= n - i; j++) {

        // for left side rhombus
        // j <= n + i
        System.out.print(" ");
      }
      // for stars
      for (int j = 1; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
