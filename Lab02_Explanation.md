# Lab02 – Print Patterns (Multi-Line Console Output)

## 1. Project Overview

This lab is a small Java console application that prints a fixed, multi-line message to the console. It reinforces the minimum structure required for a runnable Java program and introduces precise output formatting using `System.out.println`.

### What this project does
When completed, the program prints the following output exactly:

```
Java
is
fun!
```

### What problem it solves
Many beginner programs fail due to small formatting differences such as missing line breaks, incorrect spacing, or incorrect case. This lab trains precision by requiring the console output to match an expected output contract exactly.

### Concepts taught
- Package declaration and project organization
- Class declaration and file naming conventions
- The `main` method as the Java entry point
- Console output using `System.out.println`
- Multi-line output and newline behavior
- Output correctness as a contract (exact matching)

## 2. Project Structure

Typical layout in a Java project:

```
src/
  com/
    obb/
      labs/
        introduction/
          Lab02_PrintPatterns.java
```

### Packages and folders
- `com.obb.labs.introduction` is the package name.
- Packages map to folders. This file should be located at:
  `src/com/obb/labs/introduction/Lab02_PrintPatterns.java`

### Purpose of each file
- `Lab02_PrintPatterns.java`  
  The student-facing lab file. Learners complete the TODO section to produce the required output.

## 3. Full Code Explanation (Line by Line)

Source code:

```java
package com.obb.labs.introduction;

public class Lab02_PrintPatterns {

    public static void main(String[] args) {

        // TODO:
        // Print the following exactly:
        //
        // Java
        // is
        // fun!

    }
}
```

### Package Declaration
Declares the package for this class. Packages organize classes and prevent naming conflicts.

### Class Declaration
Defines the class and enforces file naming conventions.

### Main Method
Defines the program entry point.

### Printing Output
Uses `System.out.println` to send text to the console.

## 4. Execution Flow

1. JVM loads the class.
2. JVM calls `main`.
3. Statements execute in order.
4. Output appears in the console.

## 5. Key Learning Points

- Java programs require a valid `main` method.
- Output formatting is strict and exact.
- Each `println` adds a newline.

## 6. Common Mistakes

- Using `print` instead of `println`
- Extra spaces
- Incorrect case
- Missing lines

## 7. Real-World Mapping

This pattern appears in:
- Command-line tools
- Logging systems
- Automated test frameworks
- CI/CD pipelines

Exact output validation is a core professional skill.
