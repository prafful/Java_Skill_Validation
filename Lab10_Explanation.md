# Lab10 Organising Java Classes Using Packages (Bank Summary)

## 1. Project Overview

This project models a simple banking system where multiple bank accounts are created, updated through transactions, and summarized in a final report.

The program performs the following operations:

* Creates two bank accounts.
* Applies deposits and withdrawals.
* Applies monthly business rules.
* Prints a formatted financial summary.

### What problem this project solves

As Java programs grow, placing all classes in a single folder becomes unmanageable. This project demonstrates how to:

* Separate **business logic** from **application logic**.
* Organize classes into meaningful packages.
* Use imports to connect independent modules.

This reflects how real enterprise systems are structured.

### Concepts taught

This lab teaches:

* Java packages and folder structure.
* Domain vs application responsibilities.
* Object creation and method invocation.
* Encapsulation using private fields.
* Business rule implementation.
* Loop-based processing.
* Formatted output.
* Refactoring and architectural organization.

---

## 2. Project Structure

Expected structure after refactoring:

```
src/
 └── com/
     └── obb/
         └── labs/
             ├── domain/
             │     └── MyBank.java
             └── classes_package/
                   └── Lab10_Packages_Bank_Summary.java
```

### Package Responsibilities

| Package                        | Purpose                                    |
| ------------------------------ | ------------------------------------------ |
| `com.obb.labs.domain`          | Pure business logic (no printing, no main) |
| `com.obb.labs.classes_package` | Application entry point and orchestration  |

---

## 3. Full Code Explanation (Line by Line)

### File: `MyBank.java`

Package: `com.obb.labs.domain`

This class represents a real-world bank account.

#### package

```java
package com.obb.labs.domain;
```

Defines the namespace of the class. The folder structure must match this exactly.

#### class

```java
public class MyBank
```

Declares a public class that can be used from other packages.

#### private fields

```java
private String accountNo;
private String holderName;
private String type;
private double balance;
```

Private fields enforce **encapsulation**. Other classes cannot modify these directly.

#### constructor

```java
public MyBank(String accountNo, String holderName, String type, double balance)
```

Constructors initialize objects. This ensures every bank account starts in a valid state.

#### getters and setters

```java
public String getAccountNo()
public void setAccountNo(String accountNo)
```

These provide controlled access to private data.

This is a core principle of **object-oriented design**.

#### deposit method

```java
public void deposit(double amount)
```

Adds money to balance only if amount is positive.

Demonstrates:

* method
* parameter
* condition
* state change

#### withdraw method

```java
public boolean withdraw(double amount)
```

Returns a boolean to indicate success or failure.

Demonstrates:

* validation logic
* business rules
* defensive programming

#### applyMonthlyUpdate

```java
public void applyMonthlyUpdate()
```

Encodes business behavior:

* SAVINGS → interest calculation
* CURRENT → service fee deduction

This is where **domain intelligence lives**.

#### isRich

```java
public boolean isRich(double threshold)
```

Implements a decision rule based on data.

---

### File: `Lab10_Packages_Bank_Summary.java`

Package: `com.obb.labs.classes_package`

This is the application controller.

#### import

```java
import com.obb.labs.domain.MyBank;
```

Allows usage of domain class from another package.

This line enforces architectural dependency.

#### main method

```java
public static void main(String[] args)
```

Program entry point. JVM always starts here.

#### object creation

```java
MyBank a1 = new MyBank(...)
```

Creates real domain objects in memory.

#### method calls

```java
a1.deposit(500);
a1.withdraw(200);
```

Demonstrates message passing between objects.

#### loop

```java
for (int i = 0; i < 2; i++)
```

Applies business rules repeatedly.

Demonstrates:

* control flow
* iteration
* batch processing

#### formatted output

```java
String.format("%.2f", value)
```

Ensures financial values are printed correctly.

---

## 4. Execution Flow

1. JVM starts at `main()`.
2. Two `MyBank` objects are created.
3. Transactions are applied in order.
4. Monthly update runs twice.
5. Summary is printed using getters.
6. Rich accounts are counted.
7. Program terminates.

Data flow:

```
main() → creates objects  
objects → apply business rules  
main() → reads final state  
main() → prints report  
```

---

## 5. Key Learning Points

Technical:

* Package declarations must match folder structure.
* Domain classes must not print or contain main().
* Application classes orchestrate behavior.
* Encapsulation protects data.
* Business rules belong in domain.

Conceptual:

* Architecture is part of correctness.
* Code organization affects maintainability.
* Objects represent real-world entities.
* Behavior lives with data.

---

## 6. Common Mistakes

| Mistake                   | Why it happens                 |
| ------------------------- | ------------------------------ |
| Wrong package name        | Folder mismatch                |
| Printing in domain        | Confusion about responsibility |
| Accessing fields directly | Misunderstanding encapsulation |
| Hardcoding output         | Ignoring business logic        |
| Skipping getters          | Poor design habits             |

---

## 7. Real-World Mapping

This structure maps directly to enterprise systems:

| Concept           | Industry Equivalent    |
| ----------------- | ---------------------- |
| Domain package    | Microservice core      |
| Application class | Controller / API layer |
| Business rules    | Service layer          |
| Output contract   | API response           |
| Packages          | Maven group structure  |

Large systems extend this pattern with:

* DTO layers
* persistence layers
* REST controllers
* service abstractions

But the architectural principle remains identical.

---

## Summary

This lab teaches that:

Correct software is not just about logic.
Correct software is about **structure, responsibility, and contracts**.

If the packages are wrong, the system is wrong.
If the domain prints output, the design is wrong.
If the application knows business rules, the architecture is wrong.

This is the same discipline used in:

* Banking platforms
* Telecom billing engines
* ERP systems
* Financial trading software

