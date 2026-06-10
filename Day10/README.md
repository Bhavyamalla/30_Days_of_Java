# Day 10: Recursion 3 - Factorial

## Problem Statement

Given an integer `n`, calculate and return its factorial using recursion.

The factorial of a non-negative integer `n` is defined as:

* `n! = n × (n - 1) × (n - 2) × ... × 1`
* `0! = 1`

## Approach

This problem is solved using **recursion**.

A recursive function calls itself until it reaches a base case.

### Base Case

```java
if (n == 0 || n == 1) {
    return 1;
}
```

When `n` becomes `0` or `1`, the recursion stops.

### Recursive Case

```java
return n * factorial(n - 1);
```

The function multiplies the current number by the factorial of the previous number.

## Example

### Input

```text
4
```

### Recursive Calls

```text
factorial(4)
= 4 * factorial(3)
= 4 * 3 * factorial(2)
= 4 * 3 * 2 * factorial(1)
= 4 * 3 * 2 * 1
= 24
```

### Output

```text
24
```

## Algorithm

1. Read the integer `n`.
2. Check if `n` is `0` or `1`.
3. If true, return `1`.
4. Otherwise, return `n * factorial(n - 1)`.
5. Print the result.

## Time Complexity

```text
O(n)
```

The function makes one recursive call for each value from `n` down to `1`.

## Space Complexity

```text
O(n)
```

Due to the recursive call stack.

## Concepts Practiced

* Recursion
* Base Case and Recursive Case
* Function Calls
* Mathematical Computation
* Problem Solving

## Learning Outcome

This challenge demonstrates how recursion can be used to solve problems by breaking them into smaller subproblems until a simple base case is reached. Factorial is one of the most common introductory examples for understanding recursion.
