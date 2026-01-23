# Lab 13 Substring Scan (Pattern Detection)

## 1. Project Overview

### What this project does
This project scans a sentence and counts how many times a specific substring occurs inside it.

Given the sentence:

`the quick brown fox swallowed down the lazy chicken`

and the search pattern:

`ow`

the program calculates how many **non-overlapping** occurrences of `"ow"` appear.

The expected result is:

- `"brown"` → contains `"ow"`
- `"down"` → contains `"ow"`

Total count: **2**

### What problem it solves
In plagiarism detection, text analytics, and search engines, systems often need to detect repeated patterns within large bodies of text. These patterns can indicate:

- copied phrases
- suspicious similarity
- frequency of keywords

This project models the core logic of such systems using simple string scanning.

### What concepts it teaches
This project introduces and reinforces:

- Domain vs application layering
- Object creation and constructors
- Encapsulation using private fields
- String searching using `indexOf`
- Loop-based scanning
- Method return values
- Non-overlapping substring logic
- Clean separation between computation and output

---

## 2. Project Structure

The project uses two packages.

### `com.obb.labs.domain`
Contains business logic.

File:
- `SubstringCounter.java`

Purpose:
- Stores the text.
- Performs substring counting.
- Contains no printing or user interface code.

### `com.obb.labs.strings`
Contains application entry point.

File:
- `Lab13_SubstringScanApp.java`

Purpose:
- Creates domain objects.
- Calls business methods.
- Prints formatted output.

This structure follows clean architecture principles:
- Domain logic is reusable.
- Application logic handles orchestration.

---

## 3. Full Code Explanation (Line by Line)

### File: `Lab13_SubstringScanApp.java`

```java
package com.obb.labs.strings;
```

Defines the package namespace.  
Packages organize code and prevent naming conflicts.

```java
import com.obb.labs.domain.SubstringCounter;
```

Imports the domain class so it can be used.

```java
public class Lab13_SubstringScanApp {
```

Declares the application class.

- `public`: accessible from any package.
- `class`: defines a new type.

```java
public static void main(String[] args) {
```

Program entry point.

Keyword meanings:

- `public`: required for JVM access.
- `static`: belongs to class, not instance.
- `void`: returns nothing.
- `main`: JVM entry method.
- `String[] args`: command-line arguments.

```java
String sentence = "the quick brown fox swallowed down the lazy chicken";
```

Declares a variable.

- `String`: immutable text type.
- `sentence`: variable name.
- Value assigned is a string literal.

```java
SubstringCounter counter = new SubstringCounter(sentence);
```

Creates a domain object.

Concepts:
- Object instantiation
- Constructor call
- Reference variable

```java
int count = 0;
```

Declares an integer variable.

- `int`: primitive numeric type.
- Stores result of computation.

This is a placeholder for TODO logic.

```java
System.out.println("Needle  : ow");
System.out.println("Count   : " + count);
```

Prints formatted output.

- `System.out`: console output stream.
- `println`: prints line with newline.
- `+`: string concatenation.

---

### File: `SubstringCounter.java`

```java
package com.obb.labs.domain;
```

Defines domain package.

```java
public class SubstringCounter {
```

Business class responsible for counting.

```java
private String text;
```

Private field.

Encapsulation:
- External code cannot modify directly.
- Protects internal state.

```java
public SubstringCounter(String text) {
    this.text = text;
}
```

Constructor.

- Initializes object state.
- `this.text` refers to instance variable.
- `text` refers to parameter.

```java
public String getText() {
    return text;
}
```

Getter method.

Provides read access to private field.

```java
public int countOccurrences(String needle) {
    return 0;
}
```

Business method to implement.

Purpose:
- Scan `text` for occurrences of `needle`.
- Return total count.

Key concept:
- Non-overlapping scanning.

---

## 4. Execution Flow

1. JVM starts at `main()`.
2. Sentence string is created.
3. `SubstringCounter` object is constructed.
4. `countOccurrences("ow")` is called.
5. Method scans text.
6. Result is returned.
7. Application prints output.

Data flow:

Input:
- Sentence
- Search pattern

Processing:
- Loop-based index scanning

Output:
- Integer count

---

## 5. Key Learning Points

- String search uses methods, not manual indexing.
- Domain code should never print.
- Application code should never contain logic.
- Loops model repeated operations.
- Methods return values instead of mutating output.
- Encapsulation protects internal state.

---

## 6. Common Mistakes

### Overlapping counting
Using:

```java
idx = found + 1;
```

Counts overlapping patterns incorrectly.

Correct:
- Advance index by `needle.length()`.

### Infinite loop
If index is not advanced, loop never ends.

### Using `contains()` only
`contains()` returns boolean, not count.

### Returning 0
Leaving TODO unimplemented causes incorrect output.

---

## 7. Real-World Mapping

### Practical usage
- Plagiarism detection
- Keyword frequency analysis
- Log scanning systems
- Search engines
- Natural language processing

### Enterprise scaling
In large systems:

- Text is streamed from files or databases.
- Counting is parallelized.
- Regex engines replace manual scanning.
- Results feed dashboards and analytics pipelines.

The same mental model remains:
- Input → scan → count → return.

---

