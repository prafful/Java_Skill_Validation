# Lab03 – Formatted Console Report

## 1. Project Overview

This lab is a Java console application that prints a structured, multi-line report to the console. The program focuses on producing aligned and formatted output that matches an exact specification.

### What this project does  
When completed, the program prints the following output exactly:

```
Name    : Alice
Age     : 25
Salary  : 50000
----------------
Status  : ACTIVE
```

### What problem it solves  
In real software systems, programs often generate human-readable reports, logs, summaries, and diagnostic output. These outputs must follow precise formats so that they are readable, verifiable, and sometimes machine-processed.

This lab trains precision and attention to detail by requiring exact output matching.

### Concepts taught  
- Package-based project structure  
- Class declaration and file organization  
- The `main` method as execution entry point  
- Console output formatting  
- Multi-line structured output  
- Output as a contract (exact matching)  

## 2. Project Structure

Typical layout:

```
src/
  com/
    obb/
      labs/
        introduction/
          Lab03_Report.java
```

### Packages and folders  
- `com.obb.labs.introduction` is the package name.  
- Java packages map directly to folder structures.  
- This class must be stored in:
  `src/com/obb/labs/introduction/Lab03_Report.java`

### Purpose of each file  
- `Lab03_Report.java`  
  The student-facing lab file. Learners implement the TODO section to generate the required formatted output.

## 3. Full Code Explanation (Line by Line)

Source code:

```java
package com.obb.labs.introduction;

public class Lab03_Report {

    public static void main(String[] args) {

        // TODO:
        // Print the following exactly:
        //
        // Name    : Alice
        // Age     : 25
        // Salary  : 50000
        // ----------------
        // Status  : ACTIVE

    }
}
```

## 4. Execution Flow

1. JVM loads `Lab03_Report`.  
2. JVM locates `main`.  
3. Execution begins inside `main`.  
4. Each print statement runs sequentially.  
5. Output appears in the console in order.

## 5. Key Learning Points

- A valid Java program requires a class and a `main` method.  
- Output formatting is part of program correctness.  
- Console output can be structured and aligned.  
- Whitespace and line order are significant.  

## 6. Common Mistakes

- Using `print` instead of `println`  
- Extra spaces  
- Wrong capitalization  
- Extra blank lines  
- Incorrect alignment  

## 7. Real-World Mapping

This pattern appears in:

- Command-line reporting tools  
- Financial summaries  
- Log file generation  
- Monitoring dashboards  
- Automated test systems  

The ability to generate structured output reliably scales into professional systems.
