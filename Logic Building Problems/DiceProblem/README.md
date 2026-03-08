# Dice Opposite Face Problem

You are given a cubic dice with 6 faces. All the individual faces have a number printed on them. The numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with a face of this cube, your task is to guess the number on the opposite face of the cube.

Examples:

Input: n = 2
Output: 5
Explanation: For dice facing number 5 opposite face will have the number 2.

Input: n = 6
Output: 1
Explanation: For dice facing number 6 opposite face will have the number 1.

- Given a number on a standard dice (1–6), find the opposite face.

  Opposite faces on a dice:
  1 ↔ 6
  2 ↔ 5
  3 ↔ 4

## Approaches

1. If-Else Logic

- Use conditional statements to map each face to its opposite.

2. Mathematical Formula => Sum Of Two Sides => (7 - n)

- Opposite faces on a dice always sum to **7**
  so,
  opposite = 7-n;
