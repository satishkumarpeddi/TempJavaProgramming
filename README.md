# TempJavaProgramming

## Overview  
TempJavaProgramming is a collection of example Java programs demonstrating many core and advanced features of the Java language — especially focusing on I/O (file/stream), serialization, multithreading & concurrency, exception handling, data/time APIs, and abstraction/interface features. It serves as a learning/reference repository for Java programmers to explore how various Java constructs behave in real code.

## Contents  

### Core Concepts & Utilities  
- `ArrayOfMethods.java` — Example of organizing multiple operations into separate methods to show method calling/abstraction.  
- `AbstractMethod.java` — Demonstrates use of abstract classes and abstract methods (inheritance, polymorphism).  
- `ExceptionError.java` — Shows exception handling (try/catch/finally), compile-time vs runtime errors, and error propagation.  

### Input / Output (I/O) & Serialization  
- `FileInputOutputStream.java` — Illustrates using `FileInputStream` and `FileOutputStream` for basic byte-level I/O.  
- `BufferedInputOutputStream.java` — Demonstrates buffered I/O using `BufferedInputStream` / `BufferedOutputStream`, improving efficiency over raw streams.  
- `CharacterInputOutputStream.java` — Uses character-stream I/O for reading/writing text data (e.g. `InputStreamReader`, `OutputStreamWriter`, or character-based readers/writers).  
- `BufferedReaderWrite.java`, `PrintWriterBufferedReader.java`, `OuputStreamWriterInputStreamReader.java` — Show how to combine buffered readers/writers and print/reader abstractions for efficient text-based I/O.  
- `DataInputOutputStream.java` — Example of using `DataInputStream` / `DataOutputStream` for reading/writing primitive data types in a portable binary format.  
- `ComplexSerialization.java` — Demonstrates Java object serialization: writing objects to streams and reading them back (object persistence, serialization / deserialization).  

### Date / Time Handling  
- `DateAndTime.java` — Illustrates use of Java’s date and time APIs (likely `java.util.Date`, `java.time`, etc.) to work with dates/times — parsing, formatting, computing durations or differences.  

### Multithreading & Concurrency  
- `MultiThreadingUsingThreadClass.java`, `MultiThreadingUsingRunnableInterface.java` — Show ways to create and run threads in Java: by extending `Thread` and by implementing `Runnable`.  
- `ThreadLifeCycleDemo.java`, `ThreadLifeCycleUsingRunnableInterface.java` — Demonstrate life-cycle of threads: creation, start, run, termination, joining.  
- `ThreadingUsingThreadClass.java`, `ThreadingUsingRunnableInterface.java` — Additional threading examples, possibly showing concurrency control, thread coordination.  
- `InterCommunicationThread.java` — Demonstrates thread-to-thread communication (e.g. wait/notify or shared data), synchronization, or inter-thread signaling.  
- `RaceCondition.java` — Shows concurrency hazards (race conditions), demonstrating what can go wrong when sharing mutable data between threads without proper synchronization.  
- `DeadlockDemo.java` — Example of deadlock situations when threads acquire locks in conflicting orders; useful to learn pitfalls of concurrency and how to avoid them.  

### Functional / Interface / Lambda / Default & Static Interface Methods  
- `FunctionalInterfaceDemo.java` — Demonstrates Java’s functional interfaces (single-method interfaces), possibly usage with lambdas or method references.  
- `DefaultStaticInterfaceDemo.java`, `RealWorldDefaultInterface.java` — Show usage of default and static methods inside interfaces (features introduced since Java 8), enabling backward-compatible interface evolution.  

### Algorithm / Utility Examples  
- `BinarySearchUsingCommandLineArgs.java` — Implementation of binary search algorithm, possibly demonstrating command-line argument parsing and basic algorithm logic.  

### Memory & Resource Management / Java Internals  
- `MemoryManagementInJavaProgrammingLanguage.java` — Demonstrates Java memory management concepts: garbage collection, object creation/lifecycle, stack vs heap, memory leaks, or best practices.  

## Usage  

1. **Prerequisites**: Java Development Kit (JDK) version 8 or higher installed.  
2. **Compile & Run**: Each `.java` file is a standalone demo or example. From command-line:  
   ```bash
   javac SomeDemo.java  
   java SomeDemo   # or include package path if any  
Observe behavior: Many demos — especially threading, deadlock, race condition — will show behaviors only when run, highlighting concurrency issues or correct synchronization.

Modify / Extend: Use these examples as templates. You can adapt them to experiment with different I/O types, concurrency models, data serialization, and object-oriented features.

Who Is This For
Students learning Java fundamentals and advanced topics.

Developers wanting to revisit or revise Java core concepts: I/O, threading, concurrency, serialization, memory management.

Teachers or mentors needing ready-made example code to demonstrate Java features in class or tutorials.

Why This Repository
Provides a wide breadth of Java programming topics in one place — from simple method abstraction to complex concurrency pitfalls.

Encourages hands-on learning: example source files you can compile, run, experiment with — better than just reading theory.

Acts as a reference library: once you understand each example, you can reuse or adapt patterns in real projects.

License / Contribution
No license specified.
If you wish to contribute improvements — e.g. better documentation, new examples, bug fixes — feel free to fork the repository and submit a pull request.

Suggested Improvements
Add a high-level package structure instead of flat .java files (e.g. io, concurrency, serialization, algorithms).

Provide detailed comments/documentation inside each file explaining what’s happening, expected output, pitfalls.

Add a build system (e.g. Maven or Gradle) to compile/run all demos easily.

Add a summary table mapping file name → concept demonstrated.

Include output sample or readme snippets describing what happens when you run each example (e.g. showing race condition, or deadlock).
