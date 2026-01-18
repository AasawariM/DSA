public class HollowRectangle {
  public static void main(String[] args) {

    int i, j;
    int n = 4;
    int m = 5;
    for (i = 1; i <= n; i++) { // for rows
      for (j = 1; j <= m; j++) { // for columns

        // jab either i or j is either 1 or m/n then only we need to print *.
        // i.e star should be printed if any border condition is true.
        if (i == 1 || i == n || j == 1 || j == m) {
          System.out.print("*");
        }
        // else used bcz jab nahi print krna * waha space dena to get hollow rectangle
        else {
          System.out.print(" ");
        }
      }
      System.out.println(); // to get new line after each row
    }
  }
}
