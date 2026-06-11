# Day 11 - Binary Numbers

## Problem Statement

Given a base-10 integer `n`, convert it into its binary representation and determine the maximum number of consecutive `1`s in the binary form.

Print the length of the longest sequence of consecutive `1`s.

## Example

Input:

```text
13
```

Binary Representation:

```text
1101
```

Output:

```text
2
```

Explanation:

The binary number `1101` contains a maximum of `2` consecutive `1`s.

## Approach

1. Read the decimal number `n`.
2. Convert it to binary using `Integer.toBinaryString()`.
3. Traverse each bit in the binary string.
4. Count consecutive `1`s:

   * If the current bit is `1`, increase the current count.
   * Update the maximum count if needed.
   * If the current bit is `0`, reset the current count.
5. Print the maximum count.

## Concepts Used

* Binary Number System
* String Manipulation
* Loops
* Conditional Statements
* Math Functions (`Math.max()`)

## Code Logic

```java
for (char bit : binary.toCharArray()) {
    if (bit == '1') {
        currentCount++;
        maxCount = Math.max(maxCount, currentCount);
    } else {
        currentCount = 0;
    }
}
```

The loop scans the binary representation and keeps track of the longest streak of consecutive `1`s.

## Time Complexity

* O(k)

where `k` is the number of bits in the binary representation.

## Space Complexity

* O(k)

for storing the binary string.

## Learning Outcome

This problem helps practice:

* Decimal to Binary Conversion
* String Traversal
* Counting Consecutive Elements
* Tracking Maximum Values
* Problem Solving with Binary Numbers
