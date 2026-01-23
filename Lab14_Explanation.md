
# Lab14 Java Inheritance & Abstraction Lab Tutorial

## 1. Project Overview

This project demonstrates how **inheritance**, **abstraction**, and **polymorphism** work together in Java by modelling a simple banking system.

The system contains:
- An abstract base class representing a generic bank account.
- Multiple concrete subclasses representing specific account types.
- A test application that uses these classes polymorphically.

This project teaches:
- How to design abstract domain models.
- How subclasses override behavior.
- How arrays of abstract types enable polymorphism.
- How encapsulation protects internal state.
- How application layers orchestrate domain logic.

---

## 2. Project Structure

```
com/obb/labs/
 ├── domain/
 │    └── InheritAccount.java
 └── inheritance/
      └── Lab14_TestInheritance.java
```

### Domain Package (`com.obb.labs.domain`)
Contains pure business logic. No printing or execution logic.

### Inheritance Package (`com.obb.labs.inheritance`)
Contains the application entry point and orchestration.

---

## 3. Full Code Explanation

### InheritAccount.java

```java
package com.obb.labs.domain;
```

Defines the namespace. Packages prevent class name conflicts and organize code.

```java
public abstract class InheritAccount
```

Declares an abstract class. Abstract classes:
- Cannot be instantiated.
- Can contain abstract methods.
- Serve as templates for subclasses.

```java
private double balance;
private String name;
```

Private fields. This enforces **encapsulation**.
Other classes must use getters/setters.

```java
public InheritAccount(String name, double balance)
```

Constructor. Used when subclasses call `super()`.

```java
public abstract void addInterest();
```

Abstract method.
Forces every subclass to implement its own interest logic.

```java
public String getDetails()
```

Returns a formatted summary string.
Used by the application for printing.

```java
protected String padRight(String text, int width)
```

Helper method.
Protected allows access only by subclasses.

---

### Lab14_TestInheritance.java

```java
public class Lab14_TestInheritance
```

Defines the application class.

```java
public static void main(String[] args)
```

Entry point of the program.
JVM always starts here.

```java
InheritAccount[] accounts = null;
```

Declares an array of abstract type.
Polymorphism allows storing any subclass here.

```java
for (int i = 0; i < accounts.length; i++)
```

Index-based loop.
Ensures predictable output order.

```java
accounts[i].addInterest();
```

Dynamic method dispatch.
Correct subclass method is called at runtime.

---

## 4. Execution Flow

1. JVM starts at `main()`.
2. Accounts array is created.
3. Subclass objects are stored in abstract array.
4. Loop executes:
   - Calls addInterest() polymorphically.
   - Calls getDetails() for formatting.
5. Output printed.

---

## 5. Key Learning Points

- Abstract classes define contracts.
- Subclasses provide implementations.
- Private fields enforce encapsulation.
- Arrays of abstract types enable polymorphism.
- Application layer must not contain business rules.
- Domain layer must not contain printing or I/O.

---

## 6. Common Mistakes

| Mistake | Why It Happens |
|--------|----------------|
| Trying to instantiate abstract class | Misunderstanding abstraction |
| Accessing private fields directly | Ignoring encapsulation |
| Forgetting @Override | Leads to silent bugs |
| Printing in domain class | Violates separation of concerns |
| Using instanceof everywhere | Defeats polymorphism |

---

## 7. Real-World Mapping

This pattern is used in:
- Payment gateways
- User role systems
- Notification systems
- Plugin architectures
- Microservice domain models

Enterprise systems commonly have:
- Abstract domain models
- Dozens of implementations
- Controllers calling abstract interfaces
- Dependency injection frameworks wiring everything together

This exact design appears in:
- Spring services
- Hibernate entities
- REST controllers
- Financial transaction engines

---


