# Lab07 Telecom Billing App (Looping & Branching Lab)

## 1. Project Overview

This project is a small Java console application that prints a telecom billing report based on a customer's subscription data. The application follows a simple layered design:

- A **domain** class (`SubscriptionAccount`) models the subscription and contains the **business rules** (calculations and labels).
- An **application** class (`Lab07_TelecomBillingApp`) constructs the domain object, calls domain methods, and prints the **final formatted output**.

### What problem it solves

Many beginner programs mix calculation logic and printing logic inside `main()`. That approach works for tiny scripts, but it does not scale and it becomes hard to test. This lab solves that by separating:

- **Business rules** (subtotal, discount, tax, final total) into the domain layer
- **Orchestration and output formatting** into the application layer

This separation makes the program easier to understand, change, and test.

### Concepts it teaches

- Packages and clean structure
- Classes and objects
- Encapsulation using `private` fields + getters/setters
- Business methods and method composition (methods calling methods)
- Control flow with `if/else` and `switch/case`
- Looping with `for` and stopping with `break`
- Formatted console output using `System.out.printf`
- Deterministic output contracts (important for automated test harnesses)

---

## 2. Project Structure

Recommended layout (based on the provided package declarations):

```
src/
 └── main/
     └── java/
         └── com/
             └── obb/
                 ├── domain/
                 │   └── SubscriptionAccount.java
                 └── labs/
                     └── loop_branch/
                         └── Lab07_TelecomBillingApp.java
```

### Packages

- `com.obb.domain`  
  Contains **domain/business** code. This package must not contain `main()` or printing logic.

- `com.obb.labs.loop_branch`  
  Contains the **application entry point** for this lab chapter. This package is allowed to print output and orchestrate the workflow.

### Files

- `SubscriptionAccount.java`  
  Business entity + business rules: subtotal, discount rate, discount amount, tax, final total, plan label, account status label.

- `Lab07_TelecomBillingApp.java`  
  Application runner: creates a `SubscriptionAccount`, populates it with data, calls domain methods, prints the report, and prints a short installment schedule using a loop.

---

## 3. Full Code Explanation (Line by Line)

The project contains two Java source files. The code below is the **starter (student) version** with `TODO` sections.

---

### 3.1 `com.obb.labs.loop_branch.Lab07_TelecomBillingApp`

```java
package com.obb.labs.loop_branch;

import com.obb.domain.SubscriptionAccount;

/**
 * Application / orchestration.
 * Prints a billing report in an exact format required by the test contract.
 */
public class Lab07_TelecomBillingApp {

    public static void main(String[] args) {

        SubscriptionAccount acc = new SubscriptionAccount();

        // TODO: set customerName = "Asha"
        // TODO: set planCode     = "PRO"
        // TODO: set monthlyFee   = 499.00
        // TODO: set monthsPaid   = 14
        // TODO: set active       = true

        // NOTE: Use domain methods (black-box test expects exact output).
        // TODO: compute values using domain methods:
        // subtotal, discountRatePercent, discountAmount, taxPercent, taxAmount, finalTotal

        // TODO: print EXACT report output matching the contract.
        // Formatting requirements:
        // - Use 2 decimals for money
        // - Loyalty% and Tax% should be whole numbers (10, 18)
        // - Print "First 3 due amounts:" then print Month 1..3 lines using a loop
        // - Each due amount = finalTotal / monthsPaid (2 decimals)
        // - Use a loop and stop after 3 months (break after 3)

        // TIP: Use System.out.printf for aligned formatting.
    }
}
```

#### `package com.obb.labs.loop_branch;`

- `package` declares the namespace of the class.
- The folder structure should mirror the package: `com/obb/labs/loop_branch/`.

#### `import com.obb.domain.SubscriptionAccount;`

- `import` allows this file to reference `SubscriptionAccount` without writing the full name every time.
- It also shows the dependency direction: **application depends on domain**.

#### `public class Lab07_TelecomBillingApp`

- `class` defines a new type.
- `public` means any other package can reference this class.
- This class is the **application entry point** for the lab.

#### `public static void main(String[] args)`

This is the Java entry point:

- `public`: the JVM must be able to call it.
- `static`: the JVM calls it without creating an instance of this class.
- `void`: does not return a value.
- `String[] args`: command-line arguments (not used here).

#### `SubscriptionAccount acc = new SubscriptionAccount();`

- Creates a new domain object using `new`.
- The application uses this object to store subscription information and compute the bill.

#### TODO setters

The `TODO` section requires calling setter methods such as:

- `acc.setCustomerName("Asha");`
- `acc.setPlanCode("PRO");`
- `acc.setMonthlyFee(499.00);`
- `acc.setMonthsPaid(14);`
- `acc.setActive(true);`

This enforces **encapsulation** because fields are not directly accessible.

#### TODO calculations using domain methods

The application should not implement billing formulas directly. It should call:

- `acc.calculateSubTotal()`
- `acc.loyaltyDiscountRate()`
- `acc.calculateDiscountAmount()`
- `acc.taxRate()`
- `acc.calculateTaxAmount()`
- `acc.calculateFinalTotal()`

Rates are decimal values (e.g., `0.10`), but report output expects whole-number percent values (e.g., `10`).

#### TODO output formatting

`System.out.printf` is used for stable formatting:

- `%.2f` prints a decimal number with exactly two digits after the decimal point.
- `%n` prints a platform-independent newline.

#### Loop requirement

The application must print only the first three due amounts:

- A `for` loop iterates months.
- `break` stops the loop after month 3.
- `dueAmount = finalTotal / monthsPaid` is printed with two decimals.

---

### 3.2 `com.obb.domain.SubscriptionAccount`

```java
package com.obb.domain;

/**
 * Domain object: Telecom subscription account.
 * Rules:
 * - No printing here
 * - No main() here
 */
public class SubscriptionAccount {

    private String customerName;
    private String planCode;     // BASIC / PRO / ULTRA
    private double monthlyFee;
    private int monthsPaid;
    private boolean active;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public int getMonthsPaid() {
        return monthsPaid;
    }

    public void setMonthsPaid(int monthsPaid) {
        this.monthsPaid = monthsPaid;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // ---------------- Business Methods ----------------

    /**
     * Returns the human label for the plan using switch/case:
     * BASIC -> Starter
     * PRO   -> Pro Plus
     * ULTRA -> Ultra Max
     * default -> Unknown
     */
    public String getPlanLabel() {
        // TODO: implement using switch/case
        return null;
    }

    /**
     * Subtotal = monthlyFee * monthsPaid
     */
    public double calculateSubTotal() {
        // TODO: implement
        return 0;
    }

    /**
     * Loyalty discount rate based on monthsPaid using if/else:
     * - monthsPaid >= 12  -> 0.10 (10%)
     * - monthsPaid >= 6   -> 0.05 (5%)
     * - otherwise         -> 0.00
     */
    public double loyaltyDiscountRate() {
        // TODO: implement
        return 0;
    }

    /**
     * Discount amount = subtotal * loyaltyDiscountRate
     */
    public double calculateDiscountAmount() {
        // TODO: implement (should call other business methods)
        return 0;
    }

    /**
     * Tax rate is fixed at 18% (0.18)
     */
    public double taxRate() {
        // TODO: return 0.18
        return 0;
    }

    /**
     * Tax is applied AFTER discount:
     * taxable = subtotal - discount
     * tax = taxable * taxRate
     */
    public double calculateTaxAmount() {
        // TODO: implement using methods above
        return 0;
    }

    /**
     * Final total:
     * total = (subtotal - discount) + tax
     */
    public double calculateFinalTotal() {
        // TODO: implement
        return 0;
    }

    /**
     * ACTIVE -> "ACTIVE"
     * otherwise -> "SUSPENDED"
     */
    public String statusLabel() {
        // TODO: implement using if/else
        return null;
    }
}
```

#### `package com.obb.domain;`

- Declares this class as part of the domain layer.
- Domain code should be reusable and testable without needing a console.

#### `public class SubscriptionAccount`

- Defines a domain entity for a telecom subscription account.
- The class groups data (fields) and behavior (methods).

#### `private` fields

The fields are `private` to enforce **encapsulation**:

- Encapsulation means the object controls access to its internal state.
- External code must use getters and setters.

#### Getters and setters

- Getters return field values (`getCustomerName`, `getMonthlyFee`).
- Setters update fields (`setCustomerName`, `setMonthlyFee`).
- Naming conventions:
  - `getX()` for most types
  - `isX()` for boolean fields (`isActive()`)

#### Business methods

These methods implement billing rules.

##### `getPlanLabel()`

- Uses `switch/case` to map codes to labels.
- A `default` case handles unknown plan codes.

##### `calculateSubTotal()`

- Returns `monthlyFee * monthsPaid`.

##### `loyaltyDiscountRate()`

- Uses `if/else if/else` to return a rate:
  - `0.10` for 10%
  - `0.05` for 5%
  - `0.00` for 0%

##### `calculateDiscountAmount()`

- Computes `subtotal * loyaltyDiscountRate()`.
- Should call methods instead of repeating formulas.

##### `taxRate()`

- Returns `0.18`.
- Centralizes the tax rate in one place.

##### `calculateTaxAmount()`

- Computes taxable amount after discount:
  - `taxable = subtotal - discount`
  - `tax = taxable * taxRate()`

##### `calculateFinalTotal()`

- Computes:
  - `total = (subtotal - discount) + tax`

##### `statusLabel()`

- Maps the `active` flag to output text:
  - active → `"ACTIVE"`
  - inactive → `"SUSPENDED"`

---

## 4. Execution Flow

1. The JVM starts and calls `Lab07_TelecomBillingApp.main(...)`.
2. `Lab07_TelecomBillingApp` creates `SubscriptionAccount`.
3. The application sets account data using setter methods.
4. The application calls domain methods to compute all bill values.
5. The application prints the report using consistent formatting.
6. The application calculates a per-month due amount:
   - `due = finalTotal / monthsPaid`
7. A loop prints due amounts for Month 1 to Month 3 and stops.
8. The program ends.

Data flow is intentionally one-directional:

- Application sets domain state
- Domain computes values
- Application prints output

---

## 5. Key Learning Points

### Technical learning

- How to model a real-world entity using a Java class
- How encapsulation works using private fields and public methods
- How to implement business logic through methods and return values
- How to use:
  - `switch/case` for discrete mappings
  - `if/else` for tiered rules
  - `for` loops and `break` for controlled iteration
- How to format numeric output deterministically

### Conceptual learning

- Business rules belong in domain objects, not in the application entry point.
- Applications orchestrate; domains calculate.
- Deterministic output is required for black-box tests.

---

## 6. Common Mistakes

1. **Performing calculations in `main()`**  
   Creates duplicated logic and makes testing harder. The correct approach is to compute via domain methods.

2. **Incorrect tax ordering**  
   Tax must be computed after discount, not before.

3. **Printing decimal rates instead of percent values**  
   Rates like `0.10` must be converted to `10` for display.

4. **Inconsistent formatting**  
   `499.0` vs `499.00` will typically fail an exact-output test. Use `%.2f`.

5. **Loop printing more than three months**  
   The requirement is to print only the first three due amounts. Use `break` or loop bounds.

---

## 7. Real-World Mapping

### Where this pattern is used

- Telecom billing (simplified)
- Subscription invoicing systems
- SaaS billing and renewals
- Tax and discount engines in commerce platforms

### How this scales in enterprise systems

This lab structure maps to common enterprise layering:

- Domain object → core business model
- Application orchestration → service/controller layer
- Console output → API response, PDF invoice generation, or UI rendering
- Fixed tax rate → configurable rules and jurisdiction-aware logic
- Single account → batch processing for many accounts
