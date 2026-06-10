# Phone Book Using HashMap (Java)

## Problem Statement

Given a list of names and phone numbers, create a phone book that maps each person's name to their phone number. Then process multiple queries and print the corresponding phone number if the name exists in the phone book. Otherwise, print `Not found`.

## Approach

1. Create a `HashMap<String, String>` to store names and phone numbers.
2. Read the number of entries `n`.
3. Insert each name and phone number into the HashMap using `put()`.
4. Read queries until there is no more input using `while(sc.hasNext())`.
5. For each query:

   * Check if the name exists using `containsKey()`.
   * If found, print `name=phoneNumber`.
   * Otherwise, print `Not found`.

## Data Structure Used

* **HashMap**

  * Key: Name (`String`)
  * Value: Phone Number (`String`)

HashMap provides efficient lookup operations with an average time complexity of **O(1)**.

## Example

### Input

```text
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
```

### Output

```text
sam=99912222
Not found
harry=12299933
```

## Time Complexity

* Insertion: O(n)
* Query Lookup: O(1) average per query
* Total: O(n + q)

Where:

* `n` = number of phone book entries
* `q` = number of queries

## Concepts Practiced

* HashMap
* Key-Value Pair Storage
* Input Handling with Scanner
* Searching in HashMap
* While Loop with Unknown Number of Inputs

## Learning Outcome

This problem demonstrates how HashMaps can be used to perform fast searches without iterating through all elements, making them ideal for phone books, dictionaries, caches, and lookup-based applications.
