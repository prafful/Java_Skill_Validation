# Lab06 Introduction to Objects in Java

## 1. Project Overview

This project demonstrates the fundamental concept of **object-oriented programming** in Java by modeling a simple real-world entity: a bank account.

The program creates an `Account` object, assigns values to it, retrieves those values, applies business logic (interest calculation), and prints the results.

### Problems Solved

- How to represent real-world concepts in code  
- How to separate business logic from application logic  
- How to manipulate object state using methods  

### Concepts Taught

- Classes and objects  
- Encapsulation using private fields  
- Getters and setters  
- Method invocation  
- Package organization  
- Object instantiation  
- Execution flow through `main()`  

---

## 2. Project Structure

```
com.obb.labs.domain
    Account.java        → Domain object

com.obb.labs.objects
    Lab06_TestAccount.java → Application entry point
```

### Package Responsibilities

| Package | Purpose |
|--------|---------|
| domain | Contains pure business objects |
| objects | Contains application logic |

---

## 3. Full Code Explanation

### File: Account.java

```java
package com.obb.labs.domain;
```

Defines a namespace. Prevents naming conflicts and groups related classes.

```java
public class Account
```

Defines a class. A class is a blueprint for creating objects.

```java
private double balance;
private String name;
```

Private fields store internal state. This enforces **encapsulation**.

```java
public double getBalance()
```

Getter method. Allows controlled read access.

```java
public void setBalance(double balance)
```

Setter method. Allows controlled modification.

```java
public void addInterest()
```

Business method. Modifies internal state using logic.

---

### File: Lab06_TestAccount.java

```java
public static void main(String[] args)
```

Program entry point. JVM always starts execution here.

```java
Account myAccount = new Account();
```

Creates an object using constructor.

```java
myAccount.setName("OBB Student");
```

Method call. Sends message to object.

```java
System.out.println(...);
```

Prints output to console.

```java
myAccount.addInterest();
```

Triggers business logic.

---

## 4. Execution Flow

1. JVM starts `main()`  
2. Account object created  
3. Name and balance assigned  
4. Values printed  
5. Interest applied  
6. Updated balance printed  

Data flows from:
Application → Domain → Application → Output

---

## 5. Key Learning Points

| Skill | Meaning |
|------|---------|
| Encapsulation | Protect internal data |
| Objects | Real-world modeling |
| Packages | Code organization |
| Methods | Behavior |
| Getters/Setters | Controlled access |

---

## 6. Common Mistakes

| Mistake | Why |
|--------|------|
| Forgetting package | Compiler error |
| Public fields | Breaks encapsulation |
| Not using getters | Violates design |
| Using static everywhere | Breaks object model |
| Printing from domain | Bad architecture |

---

## 7. Real-World Mapping

This pattern is used in:

- Banking systems  
- ERP software  
- REST APIs  
- Microservices  
- Domain Driven Design  

Every enterprise system uses:

- domain objects  
- service layers  
- application layers  

This lab teaches the foundation of all professional Java systems.
