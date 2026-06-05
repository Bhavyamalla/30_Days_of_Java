# Day 5 - Classes and Objects

## Description

Created a Java program that demonstrates the fundamentals of Object-Oriented Programming (OOP) using a `Person` class.

The program:
- Creates objects using a constructor.
- Validates age input.
- Classifies a person's age group.
- Simulates aging by increasing the age over time.
- Displays the age category before and after three years pass.

## Concepts Practiced

- Classes and Objects
- Constructors
- Instance Variables
- Methods
- Object Creation
- Conditional Statements
- Encapsulation Basics
- Input Handling with Scanner

## Age Classification Rules

- Age less than 13 → `You are young.`
- Age between 13 and 17 → `You are a teenager.`
- Age 18 or above → `You are old.`
- Negative age → Set age to 0 and display a warning message.

## Sample Input

```text
4
-1
10
16
18
```

## Sample Output

```text
Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.
```

## Explanation

- A `Person` object is created using the provided age.
- Invalid ages are corrected to 0.
- The program determines the age category.
- Three years are added using the `yearPasses()` method.
- The age category is checked again after aging.

## Key Methods

### Constructor

```java
public Person(int initialAge)
```

Initializes the age and validates negative values.

### amIOld()

Determines whether the person is young, a teenager, or old.

### yearPasses()

Increases the age by one year.

## Status

Completed ✅