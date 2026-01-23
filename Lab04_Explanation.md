
# Lab 04 — Java Basics: Variables, Operators, and Casting

## 1. Project Overview

This project implements a simple console-based Java program that simulates a basic car dashboard setup. The program stores information about a car, prints those values to the console, derives new values using arithmetic operations, and outputs computed results.

The problem solved here is fundamental: how to represent real-world data in memory, perform calculations on that data, and present results in a controlled, predictable way.

The concepts taught in this lab form the foundation of all Java development. Every enterprise system, regardless of scale, relies on the same ideas: variables, types, operations, and execution flow.

## 2. Project Structure

com/
 └── obb/
     └── labs/
         └── basics/
             └── Lab04_MyFirstClass.java

The project consists of a single Java file within a package. This keeps complexity low and allows full focus on understanding language mechanics before introducing object-oriented design.

## 3. Full Code Explanation

### Package

package com.obb.labs.basics;

A package is a namespace used to organize related classes. It prevents naming conflicts and supports modular system design.

### Class

public class Lab04_MyFirstClass

A class is a blueprint for creating objects. Here it is used as a container for executable logic.

public means the class is accessible from anywhere.

### main Method

public static void main(String[] args)

This is the entry point of every Java application.

static means it belongs to the class, not an instance.
void means it returns nothing.
String[] args holds command-line arguments.

### Variables

String make;
String model;
double engineSize;
byte gear;

Variables are named memory locations. They store state and allow programs to work with data.

### Data Types

String is a reference type used for text.
double is a primitive type used for decimal values.
byte is a primitive type for small integers.

Types enforce correctness and memory safety.

### Initialization

make = "BMW";

Initialization assigns actual values to variables. Java requires local variables to be initialized before use.

### String Concatenation

System.out.println("The make is " + make);

The + operator joins strings and values. Java converts non-strings into text automatically.

### Arithmetic

gear * 20

Java supports arithmetic operators for calculations.

### Type Promotion

Small numeric types are promoted to int during arithmetic to avoid overflow.

### Casting

(short)(gear * 20)

Casting explicitly converts one type into another. Java requires explicit casting for potentially unsafe conversions.

### Output

System.out.println prints to the console. In real systems, output is treated as a contract for other systems.

## 4. Execution Flow

1. JVM loads the class.
2. JVM calls main.
3. Variables are declared.
4. Variables are initialized.
5. Arithmetic is performed.
6. Output is printed.
7. Program exits.

Execution is sequential and deterministic.

## 5. Key Learning Points

Technically, the learner understands variable declaration, typing, arithmetic, casting, and console output.

Conceptually, the learner understands that software is typed state evolving through deterministic operations.

## 6. Common Mistakes

Uninitialized variables cause compile errors.
Missing casts cause type errors.
Incorrect output formatting causes test failures.

These mistakes occur due to misunderstanding type rules or execution order.

## 7. Real-World Mapping

The same pattern is used in financial systems, APIs, telemetry engines, configuration processors, and enterprise services.

Variables map to domain objects.
Arithmetic maps to business rules.
Casting maps to data normalization.
Console output maps to logging and APIs.

## Final Engineering Insight

A software system is nothing more than typed data evolving over time under explicit rules.
