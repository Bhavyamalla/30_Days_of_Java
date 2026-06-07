# Day 07 - Strings: Let's Review

## Problem Statement

Given a string `S`, split its characters into two groups:

* Characters at even indices
* Characters at odd indices

Print the even-indexed characters, followed by a space, then the odd-indexed characters.

## Example

Input:

```
2
Hacker
Rank
```

Output:

```
Hce akr
Rn ak
```

## Approach

1. Read the number of test cases.
2. For each string:

   * Traverse every character.
   * If the index is even, add it to the `even` string.
   * If the index is odd, add it to the `odd` string.
3. Print both strings separated by a space.

## Concepts Used

* Strings
* Loops (`for`)
* Conditional Statements (`if-else`)
* Character Access using `charAt()`
* Input Handling with `Scanner`

## Time Complexity

* **O(n)** per string

## Space Complexity

* **O(n)** for storing even and odd characters

## Learning Outcome

This problem helps practice:

* String traversal
* Index-based operations
* Separating data into different groups
* Basic string manipulation in Java
