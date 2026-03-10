# Prime Testing

A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.

## 2 cases

- 1. NumberPrimeOrNot
- Given a positive integer, check if the number is prime or not.
  **Key idea:**
  - A simple solution is to iterate through all numbers from 2 to n-1 and for every number check if it divides n. If we find any number that divides, we return false.
  - Instead of checking till n-1, we can check till √n because a larger factor of n must be a multiple of a smaller factor that has been already checked.
  - Math.sqrt(n) => If a number has a factor greater than √n, it must also have a factor smaller than √n. So we will always detect it when checking up to √n.
  - For every composite number:at least one factor ≤ √n
  - So checking only up to √n is always enough.
  - If n = a × b, at least one of a or b must be ≤ √n.
  - That is why prime checking only needs to go up to √n.
  - Example: n = 36
    If 36 has a factor greater than √36, its pair must be smaller than √36.
    Example:
    36 = 9 × 4
    Here
    9 > √36
    4 < √36
    So when we check 4, we already know 9 exists.
    That means checking after √n is useless.
    - Factors always come in pairs
      2 × 18
      3 × 12
      4 × 9

      Small number ←→ Large number
      meet at √n

    - Everything after √n is just reverse pair repetition.

- 2. PrintPrimeInRange
- Program to print all primes from 1 to N.
  **Key idea:**
  - Iterate from `1` to `N`.
  - For each number, check if it is prime using the prime checking function.
  - If the function returns `true`, print the number.
