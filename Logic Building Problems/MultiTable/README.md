# Multiplication Table in Java

Print the multiplication table of a number using two different approaches in Java:

1. Iterative approach (using loop)
2. Recursive approach (using recursion)

The number used in the program is 5, and the table is printed from 1 to 10.

## Iterative Approach

In this method, a for loop is used to print the multiplication table.

The loop starts from 1 and runs until 10.
In each iteration, the number is multiplied by the loop variable and printed.

This approach is simple, easy to understand, and commonly used for repeating tasks.

## Recursive Approach

In this method, recursion is used to print the multiplication table.

Recursion is a technique where a function calls itself to solve a smaller version of the same problem.

There are two important parts in recursion:

- Base case
  This is the condition that stops the function.
  If there is no base case, the program will run forever.

- Recursive case
  This is where the function calls itself with updated values so that it moves toward the base case.

In this program:
The function keeps increasing the value of i until it becomes greater than 10.
When i becomes 11, the base case is reached and recursion stops.

## Conclusion

Both approaches produce the same output.
The iterative approach uses a loop, while the recursive approach uses function calls.
