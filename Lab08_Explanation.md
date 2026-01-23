# Lab 08 – Working with Arrays of Objects in Java  
**File:** `README.md`

---

## 1. Project Overview

This project models a simple banking scenario where multiple bank accounts are created, stored in an array, and processed in a loop.

The application performs the following tasks:

- Creates an array of bank accounts.
- Populates the array using predefined names and balances.
- Prints each account’s balance before applying interest.
- Applies a business rule (10% interest).
- Prints the updated balance.

### What problem this project solves

In real software systems, data rarely exists as single isolated objects. Most systems manage **collections of objects** — users, accounts, orders, products, logs.

This lab introduces the fundamental concept of:

> Managing and processing multiple objects using arrays.

### Concepts taught

This lab teaches:

- Arrays of objects  
- Object creation inside loops  
- Separation of concerns (domain vs application)  
- Encapsulation using private fields  
- Constructors and method usage  
- Business logic inside domain objects  
- Execution flow across packages  

---

## 2. Project Structure

```
com/
 └─ obb/
     └─ labs/
         ├─ domain/
         │    └─ Bank_Account.java
         └─ arrays/
              └─ Lab08_AccountArrayApp.java
```

### Package: `com.obb.labs.domain`

Contains **pure business/domain objects**.

- No `main()`  
- No printing  
- No user interaction  
- Only data and business rules  

### Package: `com.obb.labs.arrays`

Contains the **application entry point**.

- Orchestrates object creation  
- Controls program flow  
- Handles printing and formatting  

---

## 3. Full Code Explanation (Line by Line)

### File: `Bank_Account.java`

`package` defines the namespace of the class.  
`class` is a blueprint for creating objects.  
`private` enforces encapsulation.  
Constructors initialize objects.  
Getters and setters control access.  
`addInterest()` contains business logic.

### File: `Lab08_AccountArrayApp.java`

`main()` is the program entry point.  
Arrays store references.  
`for` loop controls repetition.  
Objects are created dynamically.  
Methods operate on object state.

---

## 4. Execution Flow

1. JVM starts at `main()`  
2. Arrays are created  
3. Loop starts  
4. Objects created and processed  
5. Program exits  

---

## 5. Key Learning Points

Technical:
- Arrays hold object references  
- Encapsulation protects state  
- Business logic in domain  

Conceptual:
- Objects model real world  
- Separation of concerns  
- Scalable mental model  

---

## 6. Common Mistakes

- NullPointerException from uninitialized objects  
- Mixing UI with domain logic  
- Avoiding object usage  

---

## 7. Real-World Mapping

Banking, E-commerce, Cloud systems all use this pattern.

---

## Final Mental Model

Real software is built by creating many objects, storing them in collections, and letting each object manage its own behavior.
