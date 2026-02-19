# Even or Odd in Java

This project demonstrates two different approaches to check whether a number is even or odd in Java.

## Approach 1 Using Modulo Operator

In this method, the number is divided by 2.
If the remainder is 0, the number is even.
If the remainder is not 0, the number is odd.

This approach is simple and easy to understand.

## Approach 2 Using Bitwise AND Operator

This method uses the expression n AND 1.

In binary representation,
Even numbers always end with 0.
Odd numbers always end with 1.

When we perform n AND 1, we are checking the last bit of the number.

If the result is 0, the number is even.
If the result is 1, the number is odd.

This approach helps in understanding how numbers are stored in binary form.

## Why Bitwise Works for Negative Numbers

Java stores negative numbers using 2's complement representation.
In this representation, even numbers still end with 0 and odd numbers still end with 1.

For example, let us take -4.

First, write 4 in binary:
00000100

Flip the bits:
11111011

Add 1:
11111100

This is the binary representation of -4.

Notice that the last bit is 0, which means the number is even.

When we perform n AND 1, we only check the last bit.
Since the last bit of -4 is 0, the result is 0 and the number is even.

Because the last bit determines whether a number is even or odd, the bitwise method works correctly for both positive and negative numbers.

## Conclusion

Both approaches correctly determine whether a number is even or odd.
The modulo approach is straightforward and beginner friendly.
The bitwise approach provides a deeper understanding of binary operations.
Bitwise operators operate at the binary level and offer an alternative way to solve the problem.
