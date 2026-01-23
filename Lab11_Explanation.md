# Lab 11: File Name Converter (String Manipulation)

## 1. Project Overview

### What this project does
This project converts a document file name from one extension to another.  
Given the input file name:

- `example.doc`

the program produces an archived name:

- `example.bak`

### What problem it solves
In document management systems, files are often moved through lifecycle states such as draft, final, and archived. A common way to represent an archived version is to change its file extension (for example, `.doc` to `.bak`). This project implements that rule in a safe, reusable way.

### What concepts it teaches
This project teaches beginner-friendly but industry-relevant fundamentals:

- Package structure and importing classes
- Domain class vs application class (separation of concerns)
- Encapsulation using `private` fields with getters and setters
- Constructors and object initialization
- String processing using dot (`.`) based extension replacement
- Method design: input, processing, and return output
- Output formatting using `System.out.println`
- Completing TODO scaffolding without rewriting the full program

---

## 2. Project Structure

The code is divided into two packages.

### `com.obb.labs.domain`
Purpose: Contains business and domain logic.

- `FileNameConverter.java`  
  Holds the file name and contains the method that performs extension replacement.

Design rules applied:
- No `main()` method
- No printing (`System.out.println`) inside domain code

This makes the domain class reusable in other applications such as web services, batch jobs, or desktop applications.

### `com.obb.labs.strings`
Purpose: Application entry point and orchestration.

- `Lab11_FileNameConverter.java`  
  Contains `main()` and prints output. It creates domain objects and calls domain methods.

---

## 3. Full Code Explanation (Line by Line)

### File 1: `com.obb.labs.strings.Lab11_FileNameConverter`

```java
package com.obb.labs.strings;
```

- `package` declares the namespace of the class.
- A package groups related classes and prevents name collisions across a codebase.
- The folder structure should match the package name:
  `com/obb/labs/strings/Lab11_FileNameConverter.java`

```java
import com.obb.labs.domain.FileNameConverter;
```

- `import` allows using a class from another package without writing its full name each time.
- Without this import, code would need to reference:
  `com.obb.labs.domain.FileNameConverter`

```java
/*
A document management system needs to archive old documents.
Convert "example.doc" into "example.bak" by replacing the extension.
 */
```

- `/* ... */` is a block comment.
- Comments are ignored by the compiler and exist for documentation and clarity.

```java
public class Lab11_FileNameConverter {
```

- `class` defines a type in Java.
- `public` means the class can be accessed from any other package.
- This class is the application entry point for the lab.

```java
    public static void main(String[] args) {
```

This is the program entry point.

- `public`: the JVM must be able to access this method to start the program.
- `static`: the method belongs to the class, not to an object instance. The JVM calls it without constructing the class.
- `void`: the method does not return a value.
- `main`: reserved method name that Java uses as the startup method.
- `String[] args`: an array of command-line arguments.
  - `String` is the text data type.
  - `[]` indicates an array (fixed-length sequence).
  - `args` is the variable name.

```java
        FileNameConverter converter = new FileNameConverter("example.doc");
```

- Declares a variable named `converter` of type `FileNameConverter`.
- `new` creates a new object instance in memory.
- `FileNameConverter("example.doc")` invokes the constructor and initializes the object with the original file name.

Concepts involved:
- **Reference variable**: `converter` stores a reference to an object, not the object itself.
- **Object construction**: the constructor runs exactly once at creation time.

```java
        // TODO: call replaceExtension("bak") and store result
        String archived = null; // TODO
```

- `//` starts a single-line comment.
- `TODO` indicates unfinished student work.
- `String archived` declares a variable that will hold the converted file name.
- `null` means the variable does not yet reference a `String` object. It is a placeholder.

When implemented, this line should store the return value of a method call, such as:
- `converter.replaceExtension("bak")`

```java
        System.out.println("Original : example.doc");
```

- `System.out` is the standard output stream (console).
- `println` prints the text and ends the line with a platform-specific newline.
- `"Original : example.doc"` is a String literal.

```java
        System.out.println("Archived : " + archived);
```

- `+` concatenates Strings.
- If `archived` is `null`, Java converts it to the text `"null"` during concatenation.
- After completing the TODO, this should print `example.bak`.

```java
    }
}
```

- Closing braces end the method body and the class body.
- Braces `{}` define scope:
  - Variables declared inside a block exist only within that block.

---

### File 2: `com.obb.labs.domain.FileNameConverter`

```java
package com.obb.labs.domain;
```

- Declares the package for the domain class.
- The folder should match:
  `com/obb/labs/domain/FileNameConverter.java`

```java
public class FileNameConverter {
```

- This class contains:
  - state (`originalName`)
  - behavior (`replaceExtension`)

```java
    private String originalName;
```

- `private` restricts access to within the class only.
- This is encapsulation: the class controls its own state.
- `String` holds the original filename.

Why `private` is used:
- It prevents external code from changing `originalName` directly.
- Any updates should go through methods where validation could be added later.

```java
    public FileNameConverter(String originalName) {
        this.originalName = originalName;
    }
```

Constructor details:

- A constructor is executed during object creation.
- It initializes fields and ensures the object starts in a valid state.
- `this.originalName` refers to the instance field.
- `originalName` refers to the constructor parameter.
- `this` distinguishes the field from the parameter and is standard practice.

```java
    public String getOriginalName() {
        return originalName;
    }
```

- Getter method.
- Provides read access to the private field.
- Returns the current value of `originalName`.

```java
    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }
```

- Setter method.
- Provides write access to the private field.
- In production systems, setters often validate input before assigning.

```java
    public String replaceExtension(String newExt) {
        return null; // TODO
    }
```

This is the business method to implement.

Method signature concepts:
- `public`: accessible from other packages.
- `String`: return type of the method.
- `replaceExtension`: method name.
- `(String newExt)`: parameter list.
  - `newExt` is an input variable that holds the new extension without a dot.

Business rule:
- Replace the existing extension with `newExt`.
- `newExt` is expected to be without the dot, for example `"bak"`, not `".bak"`.

Correct transformation model:
1. Find the last dot `.` in the file name.
2. Keep everything before that dot.
3. Append a dot and the new extension.

Why the last dot matters:
- File names often contain version markers:
  - `report.v2.doc`
- The extension is the substring after the last dot, not the first dot.

Edge case:
- If there is no dot (example: `README`), a safe behavior is to append the new extension:
  - `README.bak`

---

## 4. Execution Flow

The runtime flow is deterministic and linear.

1. The JVM starts at:
   - `Lab11_FileNameConverter.main(...)`

2. `main` constructs the domain object:
   - `new FileNameConverter("example.doc")`
   - The constructor stores `"example.doc"` in the field `originalName`.

3. `main` calls the domain method (after TODO completion):
   - `converter.replaceExtension("bak")`
   - The method returns `"example.bak"`.

4. `main` prints the output:
   - A fixed original line.
   - An archived line containing the computed file name.

Data flow summary:
- `"example.doc"` enters through the constructor.
- `"bak"` enters as the method parameter.
- `"example.bak"` exits as the method return value and is printed.

---

## 5. Key Learning Points

- Separation of concerns:
  - Domain code performs transformation logic.
  - Application code handles program execution and output.
- Encapsulation:
  - `private` fields protect internal state.
  - Getters and setters provide controlled access.
- Constructor usage:
  - Object state is initialized at creation time.
- String manipulation:
  - Correct extension replacement requires last-dot detection.
- Method design:
  - Domain logic returns values instead of printing directly.

---

## 6. Common Mistakes

### Using the first dot instead of the last dot
Example:
- `report.v2.doc`
- Using the first dot would incorrectly treat the base name as `report`.

Correct approach:
- Use `lastIndexOf('.')`.

### Not handling file names without a dot
If there is no dot:
- `lastIndexOf('.')` returns `-1`.
- Calling `substring(0, -1)` throws `StringIndexOutOfBoundsException`.

Safe behavior:
- Append `.` + new extension.

### Including a dot in `newExt`
If `newExt` is provided as `".bak"` and code also inserts a dot:
- Result becomes `example..bak`.

Define and follow a clear input rule:
- `newExt` should be `"bak"` (no dot).

### Leaving TODOs unimplemented
If the method returns `null`:
- The application prints `Archived : null`.
- Any output-based tests will fail.

---

## 7. Real-World Mapping

### Where this pattern is used
- Document management systems (archiving and versioning)
- Backup utilities (`.bak`, `.old`, `.tmp`)
- Data processing pipelines that mark lifecycle states:
  - `.incoming` → `.processing` → `.done`
- Automated export/import systems that rename output files based on stage

### How this scales in enterprise systems
In larger applications:

- This transformation would be part of a reusable service or utility module.
- The application layer could be:
  - a REST controller
  - a batch processing job
  - a CLI tool
- Testing would expand to:
  - unit tests for `replaceExtension`
  - integration tests verifying end-to-end behavior

The same design principle remains:
- keep transformation logic isolated and reusable
- keep orchestration and I/O separate from business rules

---

## Trainer Reference: Passing Implementation

The following code satisfies the output contract and handles common edge cases.

### `FileNameConverter.replaceExtension`

```java
public String replaceExtension(String newExt) {
    int dot = originalName.lastIndexOf('.');
    if (dot == -1) {
        return originalName + "." + newExt;
    }
    return originalName.substring(0, dot) + "." + newExt;
}
```

### `Lab11_FileNameConverter` TODO completion

```java
String archived = converter.replaceExtension("bak");
```
