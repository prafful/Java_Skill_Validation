# Lab01 – Understanding Your First Java Program

This lab introduces the fundamental structure of a Java program. The goal is to understand how a Java application is defined, how it starts execution, and how it produces output.

The program used in this lab is shown below:

```java
package com.obb.labs.introduction;

public class Lab01_Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Java Learner!");
    }
}
```

## Package Declaration

```java
package com.obb.labs.introduction;
```

This line defines the package to which the class belongs.

A package is used to organize related classes into logical groups. It also prevents name conflicts between classes with the same name.

In physical terms, this means the file is stored in the directory:

```
com/obb/labs/introduction/
```

In real projects, every class is placed inside a package. This is standard professional practice.

## Class Declaration

```java
public class Lab01_Hello {
```

This line declares a class named `Lab01_Hello`.

A class is the basic building block of a Java program. All executable Java code must exist inside a class.

Important rule:

The file name must match the class name.  
This file must be saved as:

```
Lab01_Hello.java
```

Otherwise, the program will not compile.

## The Main Method

```java
public static void main(String[] args) {
```

This method is the entry point of the program.

When the program is executed, the Java Virtual Machine (JVM) looks for this exact method. Execution always starts from here.

Without a main method, a Java program cannot run.

This method acts as the starting point or “power switch” of the application.

## Printing Output

```java
System.out.println("Hello, Java Learner!");
```

This line prints text to the console.

Breaking it down:

- `System` is a built-in Java class
- `out` represents standard output (the console)
- `println` prints a line and moves to the next line
- The text inside quotes is what gets printed

This allows the program to communicate with the user by displaying information on the screen.

## Closing Braces

```java
}
```

The closing braces mark the end of the main method and the end of the class.

Curly braces define code blocks in Java. Everything inside a pair of braces belongs to that structure.

Java programs are built using nested blocks defined by curly braces.

## How the Program Executes

When the program is run, the following steps occur:

1. The JVM loads the class.
2. The JVM locates the main method.
3. The main method starts executing.
4. The print statement runs.
5. The message appears on the screen.

This sequence represents the full lifecycle of a simple Java application.

## Key Learning Points from This Lab

Even though the program is small, it introduces several important concepts:

- Project organization using packages
- Class structure
- Program entry point
- Console output
- Execution flow inside the JVM

Every advanced Java application, regardless of size or complexity, follows this same basic structure.
