# Lab15 Java Interfaces and Polymorphism Lab

## 1. Project Overview

This project demonstrates how Java uses interfaces, abstract classes, inheritance, and polymorphism to model real-world systems in a flexible and extensible way.

The system models financial products:

* Forex trading accounts (Current and Savings)
* Trade insurance policies

All products expose a common behavior: they can return structured information about themselves through a `getDetails()` method.

The key goal is to show how different types of objects can be treated uniformly using an interface while still behaving differently internally.

This pattern is foundational in enterprise systems where multiple product types must be handled through a single abstraction layer.

---

## 2. Project Structure

```
com.obb.labs.interfaces
    Lab15_TestInterfacesApp.java

com.obb.labs.domain
    ForexAccount.java (abstract)
    ForexCurrentAccount.java
    ForexSavingsAccount.java
    TradeInsurance.java
    Details.java
```

### Package Responsibilities

| Package    | Purpose                        |
| ---------- | ------------------------------ |
| domain     | Business logic and data models |
| interfaces | Application entry point        |

The domain package contains no printing or execution logic. It only models business concepts.

The interfaces package contains orchestration code.

---

## 3. Full Code Explanation (Line by Line)

### Details Interface

```java
public interface Details {
    String getDetails();
}
```

**interface**
An interface defines a contract. Any class implementing this must provide the specified methods.

**String getDetails()**
Declares a method that returns a string representation of object state.

---

### ForexAccount (Abstract Class)

```java
public abstract class ForexAccount implements Details
```

**abstract**
An abstract class cannot be instantiated. It exists to provide shared structure.

**implements Details**
This class promises to fulfill the interface contract.

Fields:

```java
private double balance;
private String name;
```

**private**
Encapsulation: state is hidden from outside modification.

**double / String**
Primitive and reference data types.

Constructor:

```java
public ForexAccount(String name, double balance)
```

Initializes object state.

Abstract method:

```java
public abstract void addInterest();
```

Forces subclasses to define business logic.

---

### ForexCurrentAccount

```java
public class ForexCurrentAccount extends ForexAccount
```

**extends**
Inheritance: this class reuses ForexAccount behavior.

Override:

```java
public void addInterest() {
    setBalance(getBalance() * 1.02);
}
```

Applies 2% interest.

---

### ForexSavingsAccount

Same structure, different business rule:

```java
setBalance(getBalance() * 1.10);
```

Savings accounts earn 10%.

---

### TradeInsurance

```java
public class TradeInsurance implements Details
```

Implements the interface without inheritance.

This shows interface-based polymorphism.

Fields model insurance data.

Constructor initializes state.

getDetails():

Returns formatted business output.

---

### Application Entry Point

```java
public static void main(String[] args)
```

**public**
Accessible by JVM.

**static**
Does not require object instantiation.

**void**
Returns no value.

Objects are created.

Interest is applied.

All products stored as:

```java
Details[] products
```

Polymorphic loop:

```java
for (Details d : products) {
    System.out.println(d.getDetails());
}
```

Each object responds according to its own implementation.

---

## 4. Execution Flow

1. JVM loads main class.
2. main() begins execution.
3. Objects are constructed.
4. addInterest() modifies balances.
5. Objects stored in interface array.
6. Loop calls getDetails().
7. JVM dispatches correct method.
8. Output printed.

---

## 5. Key Learning Points

| Concept        | Explanation               |
| -------------- | ------------------------- |
| Interface      | Defines behavior contract |
| Abstract class | Partial implementation    |
| Inheritance    | Code reuse                |
| Polymorphism   | Runtime method binding    |
| Encapsulation  | Data protection           |
| Constructor    | Initialization            |
| Arrays         | Uniform storage           |
| Formatting     | Output control            |

---

## 6. Common Mistakes

### Forgetting to initialize fields

Leads to null or zero outputs.

### Calling addInterest after printing

Business logic must precede presentation.

### Using concrete types instead of interface

Breaks polymorphism.

### Trying to instantiate abstract class

Illegal in Java.

---

## 7. Real-World Mapping

This exact pattern appears in:

* Banking platforms
* Trading engines
* Insurance systems
* Payment gateways
* REST services
* Plugin architectures

In enterprise systems:

Interfaces define service contracts.
Abstract classes implement base logic.
Concrete classes implement product rules.

This enables:

* Loose coupling
* Dependency injection
* Testability
* Feature extensibility
* System scalability

---

## Mental Model

Interfaces define **what a thing does**.
Abstract classes define **what a thing partially is**.
Concrete classes define **what a thing actually is**.

This structure allows large systems to grow without collapsing under complexity.
