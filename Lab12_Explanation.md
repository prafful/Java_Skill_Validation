# Lab12 Customer Name Merge (String Comparison)

## 1. Project Overview

### What this project does
This project compares two customer names and determines:

1. Whether the names are exactly equal.
2. If they are not equal, which name appears later in dictionary order.

Given:
- Name A: `Alice`
- Name B: `Alicia`

The program prints:
- Whether they are equal.
- Which name is lexicographically forward.

### What problem it solves
In customer data systems, duplicate or near-duplicate records are common.  
Before merging records, systems must determine:

- Are these records identical?
- If not, which record should take precedence?

This lab simulates that real-world decision logic using basic string comparison.

### What concepts it teaches
This project introduces and reinforces:

- Package organization
- Domain vs application layers
- Encapsulation with private fields
- Constructors and object creation
- Boolean logic
- String comparison
- Lexicographic ordering
- Method return values
- Output formatting
- TODO-driven development

---

## 2. Project Structure

The project is divided into two packages.

### `com.obb.labs.domain`
Contains business logic.

File:
- `CustomerNameMatcher.java`

Purpose:
- Stores two customer names.
- Provides comparison logic.
- Contains no printing or user interface code.

### `com.obb.labs.strings`
Contains application entry point.

File:
- `Lab12_CustomerMergeApp.java`

Purpose:
- Creates domain objects.
- Calls business methods.
- Prints formatted output.

This separation ensures clean architecture:
- Domain code is reusable.
- Application code is replaceable.

---

## 3. Full Code Explanation (Line by Line)

### File: `Lab12_CustomerMergeApp.java`

```java
package com.obb.labs.strings;
```

Declares the package namespace.  
Controls folder structure and logical grouping.

```java
import com.obb.labs.domain.CustomerNameMatcher;
```

Imports the domain class so it can be used in this file.

```java
public class Lab12_CustomerMergeApp {
```

Defines the application class.

- `public`: accessible from anywhere.
- `class`: defines a new type.

```java
public static void main(String[] args) {
```

Program entry point.

Keyword explanations:

- `public`: required so JVM can access it.
- `static`: belongs to class, not object.
- `void`: returns nothing.
- `main`: special name recognized by JVM.
- `String[] args`: command-line parameters.

```java
CustomerNameMatcher matcher = new CustomerNameMatcher("Alice", "Alicia");
```

Creates a domain object.

Concepts:
- Reference variable (`matcher`)
- Object instantiation (`new`)
- Constructor call

```java
boolean equal = false;
String forward = null;
```

Declares variables.

- `boolean`: true or false value.
- `String`: text data type.
- `null`: no object assigned yet.

These are placeholders for TODO completion.

```java
System.out.println("NameA   : Alice");
System.out.println("NameB   : Alicia");
System.out.println("Equal   : " + equal);
System.out.println("Forward : " + forward);
```

Prints formatted output.

- `System.out`: standard output stream.
- `println`: prints line and newline.
- `+`: string concatenation.

---

### File: `CustomerNameMatcher.java`

```java
package com.obb.labs.domain;
```

Defines domain package.

```java
public class CustomerNameMatcher {
```

Business class that performs comparison logic.

```java
private String nameA;
private String nameB;
```

Private fields.

Encapsulation:
- External code cannot modify directly.
- Controlled access through methods.

```java
public CustomerNameMatcher(String nameA, String nameB) {
    this.nameA = nameA;
    this.nameB = nameB;
}
```

Constructor.

- Initializes object state.
- `this` distinguishes fields from parameters.

```java
public String getNameA() { return nameA; }
public String getNameB() { return nameB; }
```

Getter methods.

Provide read-only access to private fields.

```java
public boolean isEqual() {
    return false;
}
```

Boolean method.

Purpose:
- Returns true if both names are identical.
- Uses `String.equals()`.

```java
public String lexicographicallyForward() {
    return null;
}
```

Comparison method.

Purpose:
- Uses `compareTo()`.
- Returns the name that comes later alphabetically.

---

## 4. Execution Flow

1. JVM starts at `main()`.
2. `CustomerNameMatcher` object is created.
3. `isEqual()` is called.
4. `lexicographicallyForward()` is called.
5. Results are printed.

Data flow:
- Input: two strings
- Processing: comparison logic
- Output: printed results

---

## 5. Key Learning Points

- Domain logic must not print.
- Application logic must not contain business rules.
- Boolean logic drives decisions.
- String comparison uses methods, not operators.
- Object state is initialized through constructors.
- Encapsulation protects data integrity.

---

## 6. Common Mistakes

### Using `==` instead of `equals()`
`==` compares memory addresses, not content.

Correct:
```java
nameA.equals(nameB)
```

### Forgetting to handle equal case
If names are equal, forward logic should not override.

### Returning null
Returning null causes incorrect output and test failure.

### Confusing compareTo direction
Positive means first is lexicographically later.

---

## 7. Real-World Mapping

### Practical usage
- CRM systems merging customers
- Identity matching systems
- Duplicate record cleanup
- Contact management software

### Enterprise scaling
In real systems:

- Domain logic becomes a service.
- Comparison rules expand.
- Matching algorithms include fuzzy logic.
- Results drive automated workflows.

---