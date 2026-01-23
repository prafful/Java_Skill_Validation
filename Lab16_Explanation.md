# Lab 16 Lambda Expressions (Billing Engine)

---

## 1. Project Overview

This project demonstrates how **lambda expressions** are used in Java to implement **business rules as behavior**, rather than hard-coded logic.

The system models a simple **billing flow**:

* An `Order` object represents a business transaction.
* Pricing rules (like discounts) are injected using **lambda expressions**.
* The application prints a final billing report.
* Additional lambdas demonstrate:

  * Iterating over collections.
  * Mapping values using functions.

### What Problem This Solves

Traditional object-oriented systems hard-code business rules inside classes. This makes systems rigid and difficult to change.

This project shows how:

* Rules can be **passed as code**.
* Behavior becomes **configurable at runtime**.
* Business logic becomes **composable and reusable**.

### Concepts Taught

* Packages and modular structure
* Encapsulation using private fields
* Constructors and method overloading
* Functional interfaces
* Lambda expressions
* Collections (`List`, `ArrayList`)
* Higher-order functions
* Formatting output
* Separation of concerns

---

## 2. Project Structure

```
com.obb.labs
│
├── domain
│   └── Order.java
│
└── lambdas
    └── Lab16_LambdaLabApp.java
```

### Package Responsibilities

| Package   | Purpose                                               |
| --------- | ----------------------------------------------------- |
| `domain`  | Pure business model. No printing or execution logic.  |
| `lambdas` | Application layer. Creates objects and prints output. |

This structure reflects **industry-grade layering**:

* Domain layer contains business rules.
* Application layer orchestrates behavior.

---

## 3. Full Code Explanation (Line by Line)

---

## File 1: `Order.java`

```java
package com.obb.labs.domain;
```

Defines the **namespace**. Prevents class name collisions and enables modular design.

---

### Class Declaration

```java
public class Order {
```

* `public` → accessible from other packages.
* `class` → blueprint for objects.

---

### Fields

```java
private String orderId;
private double amount;
private String customerType;
```

These represent the **state** of the object.

* `private` enforces **encapsulation**.
* Access only via methods.

---

### Derived Fields

```java
private double finalAmount;
private double taxRate;
```

Computed values based on rules.

---

### Constructors

```java
public Order() {
    this.taxRate = 0.18;
}
```

Default constructor sets safe defaults.

```java
public Order(String orderId, double amount, String customerType)
```

Parameterized constructor initializes real business data.

---

### Getters and Setters

```java
public String getOrderId()
public void setOrderId(String orderId)
```

Encapsulation principle:

* Fields are private.
* Access is controlled.

---

### Business Method: applyRule

```java
public void applyRule(PricingRule rule)
```

Accepts **behavior as a parameter**.

This is the core design pattern:

> Objects receive logic instead of owning it.

---

### Business Method: computeTax

```java
public double computeTax()
```

Pure computation, no side effects.

---

### Business Method: computeTotal

```java
public double computeTotal()
```

Composes earlier logic.

---

### Functional Interface

```java
@FunctionalInterface
interface PricingRule
```

A functional interface:

* Exactly **one abstract method**.
* Enables lambda usage.

---

## File 2: `Lab16_LambdaLabApp.java`

---

### Package Declaration

```java
package com.obb.labs.lambdas;
```

Application layer.

---

### Imports

```java
import java.util.List;
import java.util.function.Function;
```

Brings standard Java APIs into scope.

---

### main Method

```java
public static void main(String[] args)
```

Program entry point.

* `public` → JVM access.
* `static` → no object required.
* `void` → no return value.

---

### Lambda 1: Simple behavior

```java
Detailable det = () -> { return "hello world"; };
```

This replaces:

```java
class X implements Detailable {
   public String getDetails() {
      return "hello world";
   }
}
```

Lambda = **anonymous function**.

---

### Order Creation

```java
Order o = new Order("OBB-1001", 1000.0, "VIP");
```

Instantiates domain object.

---

### Pricing Rule Lambda

```java
(ord) -> {
    if ("VIP".equals(ord.getCustomerType())) {
        return ord.getAmount() * 0.90;
    }
    return ord.getAmount();
}
```

This is **executable business logic**.

Passed into:

```java
o.applyRule(rule);
```

---

### Collection Lambda

```java
items.forEach(n -> sb.append(n).append(" "));
```

Lambda passed to `forEach`.

Replaces:

```java
for(int n : items) { ... }
```

---

### Function Lambda

```java
Function<Integer, Integer> square = x -> x * x;
```

Function is a generic interface:

* Input type: Integer
* Output type: Integer

---

## 4. Execution Flow

1. JVM starts `main()`
2. Lambda created: `Detailable`
3. Order instantiated
4. Pricing rule lambda injected
5. Order computes final price
6. Taxes calculated
7. Output printed
8. List processed via lambda
9. Function applied via lambda

Data flow:

```
Lambda → Order → Computation → Output
```

Behavior is **injected**, not inherited.

---

## 5. Key Learning Points

### Technical

* Lambda syntax: `() -> {}`
* Functional interfaces
* Higher-order methods
* Runtime behavior injection
* Separation of concerns

### Conceptual

* Objects hold **state**
* Lambdas hold **behavior**
* Systems become **configurable**
* Business rules become **portable**

---

## 6. Common Mistakes

| Mistake                     | Why It Happens              |
| --------------------------- | --------------------------- |
| Forgetting return in lambda | Lambdas are expressions     |
| Using `==` for strings      | Java uses object references |
| Modifying domain from main  | Breaks layering             |
| Hard-coding logic           | Defeats lambda purpose      |
| Printing inside domain      | Violates separation         |

---

## 7. Real-World Mapping

This pattern appears in:

| System        | Usage                |
| ------------- | -------------------- |
| E-commerce    | Discount engines     |
| Banking       | Interest calculators |
| Insurance     | Risk models          |
| Rule engines  | Drools, Camunda      |
| Microservices | Policy injection     |

Enterprise systems use:

* Lambda rules loaded from DB
* Config-driven pricing
* AI-generated rule engines

This architecture scales naturally into:

* Plugin systems
* Feature flags
* Strategy patterns
* Event-driven architectures

---

## Mental Model

Traditional OOP:

> Objects = data + behavior

Lambda architecture:

> Objects = data
> Functions = behavior
> System = composition

This separation is the foundation of:

* Functional programming
* Cloud-native design
* AI decision engines

## Final Thought

This project introduces the single most important shift in modern Java:

> Behavior is no longer locked inside classes.
> Behavior becomes **data itself**.

Understanding this mental model is the gateway to:

* Streams
* Reactive systems
* Distributed rule engines
* AI orchestration pipelines
