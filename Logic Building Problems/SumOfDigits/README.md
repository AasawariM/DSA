# Sum of Digits of a Number

Given a number n, find the sum of its digits.

Examples:

Input: n = 687  
Output: 21  
Explanation: The sum of its digits is: 6 + 8 + 7 = 21

Input: n = 12  
Output: 3  
Explanation: The sum of its digits is: 1 + 2 = 3

## Approaches

1. Digit Extraction

We can sum the digits of a number by repeatedly extracting the last digit using `n % 10`, adding it to the sum, and then removing it by dividing `n` by 10 using integer division.

2. Using Recursion

We can use recursion to find the sum of digits. The idea is to extract the last digit, add it to the sum of digits of the remaining number, and repeat.

Base Case:  
If the number is 0, return 0.

Recursive Case:  
Return `(n % 10) + sumOfDigits(n / 10)`

Example:

sumOfDigits(1234)  
= 4 + sumOfDigits(123)  
= 4 + 3 + sumOfDigits(12)  
= 4 + 3 + 2 + sumOfDigits(1)  
= 4 + 3 + 2 + 1 + sumOfDigits(0)  
= 10

Output → Sum of Digits of 1234 is 10
