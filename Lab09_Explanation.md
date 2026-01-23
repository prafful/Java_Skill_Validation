# Lab09  Bank Account Transactions (Constructors, Static Members, Method Overloading)

## 1. Project Overview

This project models a simple banking transaction system.

Each bank account:

* Has an account holder name
* Has a balance
* Shares a global interest rate
* Supports interest calculation
* Supports two forms of withdrawal

The application:

* Creates multiple bank accounts
* Applies interest to each account
* Performs withdrawals
* Prints results in a fixed output format

### What problem this project solves

In real software systems, data is rarely processed as single isolated values.
Most business systems manage **collections of related objects** and apply **shared business rules**.

This project demonstrates how to:

* Model real-world entities using classes
* Apply global rules using static variables
* Reuse logic through method overloading
* Coordinate domain objects from an application layer

### What concepts this project teaches

This lab introduces and reinforces:

* Classes and objects
* Constructors
* Static variables and methods
* Encapsulation using private fields
* Getters and setters
* Method overloading
* Arrays of objects
* Control flow with loops and conditionals
* Separation of concerns between domain and application layers

---

## 2. Project Structure

```
com.obb.labs
│
├── domain
│   └── Bank_Account_Transaction.java
│
└── transaction
    └── Lab09_AccountTransactionApp.java
```

### Package: `com.obb.labs.domain`

Contains **pure business logic**.
No printing. No `main()` method. No user interaction.

This package models the **real-world concept** of a bank account.

### Package: `com.obb.labs.transaction`

Contains the **application entry point**.
Responsible for:

* Creating objects
* Calling business methods
* Printing formatted output

This package represents the **orchestration layer**.

---

## 3. Full Code Explanation (Line by Line)

### File: `Bank_Account_Transaction.java`

```java
package com.obb.labs.domain;
```

Defines the package where this class lives.
Packages group related classes and prevent name conflicts.

---

```java
public class Bank_Account_Transaction {
```

Declares a public class.
A class is a **blueprint** for creating objects.

---

```java
private String name;
private double balance;
```

Private instance variables.

* `private` enforces **encapsulation**
* Fields cannot be accessed directly from outside the class
* Access must go through methods

This protects internal state.

---

```java
private static double interestRate;
```

Static variable shared by **all objects of this class**.

There is only one `interestRate` in memory regardless of how many accounts exist.

This models **global business rules**, such as:

* Bank interest rates
* Tax rates
* Currency conversion factors

---

```java
public Bank_Account_Transaction(String name, double balance)
```

Parameterized constructor.

A constructor:

* Runs when an object is created
* Initializes instance variables
* Ensures object starts in a valid state

---

```java
public Bank_Account_Transaction()
```

No-argument constructor.

Calls the main constructor using `this(...)`.
This is called **constructor chaining**.

It avoids duplicated initialization logic.

---

```java
public String getName()
public void setName(String name)
```

Getter and setter for `name`.

This is **encapsulation in practice**:

* Field is private
* Controlled access through methods

Allows validation or logging later.

---

```java
public static double getInterestRate()
public static void setInterestRate(double rate)
```

Static accessor methods.

Because `interestRate` is static:

* These methods are also static
* Called using the class name, not object

Example:

```
Bank_Account_Transaction.setInterestRate(0.05);
```

---

```java
public void addInterest()
```

Instance method.

Uses the static interest rate to modify object state:

```
balance = balance * (1 + interestRate);
```

This demonstrates:

* Static data influencing instance behavior
* Business logic embedded inside domain class

---

```java
public boolean withdraw(double amount)
```

Withdrawal with custom amount.

Implements a business rule:

* If enough balance → subtract and return true
* Otherwise → do nothing and return false

Returns a boolean so caller can react to success or failure.

---

```java
public boolean withdraw()
```

Overloaded method.

No parameters. Always withdraws 20.

Calls:

```
return withdraw(20);
```

This demonstrates:

* Method overloading
* Code reuse
* Single source of truth for logic

---

## 4. Execution Flow

### Step 1: Program starts

```
Lab09_AccountTransactionApp.main()
```

This is the **entry point**.

---

### Step 2: Account objects created

An array of five objects is created:

```
new Bank_Account_Transaction("Alice", 100)
...
```

Memory now contains five independent account objects.

---

### Step 3: Static interest rate set

```
Bank_Account_Transaction.setInterestRate(0.05);
```

This modifies the **single global variable** shared by all accounts.

---

### Step 4: Loop processes each account

For each object:

1. Print name
2. Print initial balance
3. Call `addInterest()`
4. Print updated balance
5. Call `withdraw()`
6. Call `withdraw(x)`
7. Print final balance

The loop is the **control structure** coordinating all behavior.

---

### Step 5: Program exits

No objects remain referenced.
JVM terminates. Memory is reclaimed.

---

## 5. Key Learning Points

### Technical skills learned

* How constructors initialize objects
* How static variables work
* How to model shared business rules
* How method overloading avoids duplication
* How arrays store object references
* How getters/setters enforce encapsulation
* How instance methods mutate object state

### Conceptual skills learned

* Separating business logic from application logic
* Designing classes around real-world entities
* Thinking in terms of data flow and execution flow
* Understanding object lifecycle
* Recognizing when to use static vs instance members

---

## 6. Common Mistakes

### Mistake: Using static for balance

Incorrect:

```
private static double balance;
```

This would make all accounts share one balance.
Completely wrong business model.

---

### Mistake: Printing inside domain class

Domain classes should never print.
They represent **pure business logic**.

Printing belongs to application layer.

---

### Mistake: Duplicating withdrawal logic

Bad design:

```
public boolean withdraw() {
    if (balance >= 20) ...
}
```

This duplicates logic.
Correct design uses delegation:

```
return withdraw(20);
```

---

### Mistake: Accessing fields directly

Bad:

```
account.balance = 100;
```

This breaks encapsulation.
Makes validation impossible later.

---

## 7. Real-World Mapping

This pattern exists in almost every enterprise system.

### Banking systems

* Account entity
* Global interest policy
* Withdrawal validation
* Transaction logging

### E-commerce systems

* Product entity
* Global tax rate
* Stock deduction
* Order processing

### Payroll systems

* Employee entity
* Global tax slabs
* Salary calculation
* Deduction rules

---

## How this scales in real systems

In production systems:

* Domain classes become hundreds of fields
* Static rules move to configuration services
* Withdrawals become transaction records
* Interest calculation becomes scheduled jobs
* Data persists in databases
* APIs replace direct method calls

But the **core mental model remains identical**:

> Domain objects encapsulate business state and behavior.
> Application layer coordinates execution.
> Static rules represent shared system policy.

---

## Final Mental Model

Think of this project as three layers:

1. **Reality Layer**
   The real world: people, money, rules.

2. **Domain Layer**
   Java classes modeling reality.

3. **Application Layer**
   Code that makes things happen.

This is the same structure used in:

* Banking platforms
* ERP systems
* Trading engines
* Payment gateways
* Financial services software

This lab teaches the **foundational architecture of professional software systems**.