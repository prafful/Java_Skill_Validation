# Lab05 Trip Calculator

## 1. Project Overview

This project implements a simple **console-based Trip Calculator** for
an electric vehicle dashboard.

The program models a real-world scenario where a car system estimates:

-   Travel time for a trip\
-   Energy consumed from the battery\
-   Remaining battery capacity\
-   Safety status of the trip based on remaining range

The purpose of this project is to teach fundamental Java concepts while
following professional coding structure and discipline.

### Problems Solved

The program answers these practical questions:

-   How long will the trip take?
-   How much battery will be consumed?
-   Is the remaining energy safe?
-   What speed ranges apply to gears?

### Concepts Taught

-   Primitive data types\
-   Variables and constants\
-   Arithmetic operators\
-   Type casting\
-   Conditional logic (`if/else`)\
-   Looping (`for`)\
-   Console output\
-   Execution flow

------------------------------------------------------------------------

## 2. Project Structure

    com/obb/labs/basics/
    └── Lab05_TripCalculatorLab.java

### Package Explanation

`com.obb.labs.basics` represents:

-   `com` → company namespace\
-   `obb` → organizational domain\
-   `labs` → training modules\
-   `basics` → beginner-level Java concepts

This mirrors enterprise package naming conventions.

### File Purpose

  -----------------------------------------------------------------------
  File                           Purpose
  ------------------------------ ----------------------------------------
  Lab05_TripCalculatorLab.java   Main application containing business
                                 logic and output

  -----------------------------------------------------------------------

------------------------------------------------------------------------

## 3. Full Code Explanation

### Package Declaration

``` java
package com.obb.labs.basics;
```

Defines the logical namespace of the class.

Packages prevent class name collisions and organize code in large
systems.

------------------------------------------------------------------------

### Class Declaration

``` java
public class Lab05_TripCalculatorLab {
```

-   `public` → accessible from anywhere\
-   `class` → blueprint for creating objects\
-   This class contains the program entry point

------------------------------------------------------------------------

### main Method

``` java
public static void main(String[] args)
```

Breakdown:

  Keyword           Meaning
  ----------------- --------------------
  public            JVM can access it
  static            no object needed
  void              returns nothing
  main              program entry
  String\[\] args   command-line input

------------------------------------------------------------------------

### Constants

``` java
final String makeConst = "TATA";
```

-   `final` → value cannot change\
-   Used for system configuration data\
-   Represents immutable inputs

------------------------------------------------------------------------

### Variable Declaration

``` java
String make;
double batteryKWh;
byte gear;
short tripKm;
```

Defines memory locations that store runtime data.

Each data type maps to real memory size:

  Type     Size
  -------- ---------
  byte     1 byte
  short    2 bytes
  int      4 bytes
  double   8 bytes

------------------------------------------------------------------------

### Assignment

``` java
make = makeConst;
batteryKWh = batteryKWhConst;
```

Copies constant values into mutable runtime variables.

------------------------------------------------------------------------

### Arithmetic Operations

``` java
double hours = tripKm / avgSpeedKmph;
double minutes = hours * 60;
```

Operators:

-   `/` division\
-   `*` multiplication

------------------------------------------------------------------------

### Type Casting

``` java
int estMinutes = (int) minutes;
```

Forces a double into an integer by truncation.

Java requires explicit casting when narrowing types.

------------------------------------------------------------------------

### Business Calculations

``` java
energyUsedKWh = tripKm / efficiencyKmPerKWh;
remainingKWh = batteryKWh - energyUsedKWh;
```

Models physical relationships:

Distance ÷ efficiency = energy used

------------------------------------------------------------------------

### Conditional Logic

``` java
if (remainingKWh >= 10.0)
    rangeStatus = "SAFE";
```

Implements rule-based decision logic.

Flow:

1.  Test condition\
2.  Execute matching branch\
3.  Skip remaining

------------------------------------------------------------------------

### Output Formatting

``` java
System.out.println("Car: " + make + " " + model);
```

Prints text to console.

String concatenation uses `+` operator.

------------------------------------------------------------------------

### Manual Decimal Truncation

``` java
(double)((int)(value * 10)) / 10
```

Technique to limit decimals without libraries:

1.  Multiply\
2.  Convert to int\
3.  Divide back

This simulates fixed-point math.

------------------------------------------------------------------------

### Loop

``` java
for (short g = 1; g <= 3; g++)
```

Loop structure:

  Part    Purpose
  ------- ----------------
  g=1     initialization
  g\<=3   condition
  g++     increment

------------------------------------------------------------------------

## 4. Execution Flow

1.  JVM loads class
2.  main() starts
3.  Constants initialized
4.  Variables declared
5.  Calculations executed
6.  Conditions evaluated
7.  Output printed
8.  Loop executes
9.  Program exits

Data flows from constants → variables → calculations → printed output.

------------------------------------------------------------------------

## 5. Key Learning Points

Technical skills gained:

-   Understanding JVM execution
-   Numeric computation
-   Manual formatting
-   Type safety
-   Control flow design

Conceptual skills:

-   Modeling physical systems
-   Translating business rules into code
-   Structured program flow

------------------------------------------------------------------------

## 6. Common Mistakes

  Mistake                   Reason
  ------------------------- --------------------------------
  Forgetting casting        Java blocks unsafe conversions
  Using wrong data types    Causes precision errors
  Printing wrong format     Output contract mismatch
  Not truncating decimals   Floating rounding issues
  Loop off-by-one           Incorrect bounds

------------------------------------------------------------------------

## 7. Real-World Mapping

This pattern appears in:

-   Vehicle telemetry systems
-   Embedded dashboards
-   Billing engines
-   IoT controllers
-   Real-time monitoring software

Enterprise systems expand this model using:

-   Domain classes
-   Services
-   REST APIs
-   Databases
-   UI layers

But the execution model remains identical:

Input → compute → decide → output.
