
// aka Right Angle Triangle
// Right Half Pyramid (Pattern): A specific implementation of a right-angle triangle pattern where
//  characters/numbers increase in each left-aligned row, forming the right-angled shape. 
// They are often used interchangeably in pattern programming problems. 

// here we dont have m,n  thing we just have single n (row).
public class RightHalfPyramid {
  public static void main(String[] args) {

    // row mei kitne stars print hoge wo row number pe h
    // for example 1st row 1 star,2nd row 2 stars

    // i.e row no. will be total columns
    // eg.total rows 4 h to total columns bhi 4 hoge

    // outer loop will be row no. as usual
    // for inner loop,for columns limit will be n(row total)
    // per row utne he columns pe * print hoge jitna wo row ka number h

    // For row i, print i stars.
    int i, j;
    int n = 4;
    for (i = 1; i <= n; i++) { // rows
      for (j = 1; j <= i; j++) { // prints stars equal to row number

        // here we cannt do j==i bcz it will return true or false and if false it will
        // not print *
        // we need range not comparision
        // j<=i will be like Print stars from 1 up to i
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
