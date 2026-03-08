# Reverse Digits of a Number

Two approaches are implemented:

1. **Iterative approach (Digit by Digit using a loop)**
2. **Recursive approach**

The goal is to understand **how digits of a number can be extracted and rebuilt in reverse order**, instead of memorizing the code.

---

# Problem

Given a number:

```

Input: 1234

```

Return the reversed number:

```

Output: 4321

```

---

# Key Idea

A number is made up of digits.

Example:

```

1234

```

Digits can be extracted from **right to left** using:

```

lastDigit = number % 10

```

Removing the last digit:

```

number = number / 10

```

By repeating these steps, we can rebuild the number in reverse order.

---

# Logic Step-by-Step

Example input:

```

1234

```

| Step | Current Number | Extracted Digit | Reversed Number |
| ---- | -------------- | --------------- | --------------- |
| 1    | 1234           | 4               | 4               |
| 2    | 123            | 3               | 43              |
| 3    | 12             | 2               | 432             |
| 4    | 1              | 1               | 4321            |

Key formula:

```

reversed = reversed * 10 + lastDigit

```

Why multiply by 10?

Because it **shifts digits left**, creating space for the next digit.

Example:

```

43 * 10 = 430
430 + 2 = 432

```

---

# Approach 1 — Iterative (Loop)

This approach repeatedly extracts digits until the number becomes `0`.

Steps:

1. Extract the last digit
2. Add it to the reversed number
3. Remove the last digit from the original number
4. Repeat

---

# Approach 2 — Recursion

Recursion solves the problem by **calling the same function with a smaller number**.

For number `1234`:

```

reverse(1234)
reverse(123)
reverse(12)
reverse(1)
reverse(0)

```

At each step we update the reversed value using:

```

rev = rev * 10 + lastDigit

```

---

# Key Concepts Learned

- Modulus operator `%` for extracting digits
- Integer division `/` for removing digits
- Building numbers using place values
- Iterative problem solving
- Recursion and breaking problems into smaller steps
