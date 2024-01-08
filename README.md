

# Kotlin Crash Course

## Prerequisites

- Basic knowledge about programming/coding.
- Kotlin installed on your machine. You can install Kotlin by following the links below:

    - [Windows Installation](https://www.educba.com/install-kotlin/)
    - [Linux Installation](https://kotlinlang.org/docs/command-line.html)

## Compilation

To compile Kotlin files in `CLI-interface`, you can use the following command:

```bash
$ kotlinc source-file-name.kt -include-runtime -d output-file-name.jar
$ java -jar output-file-name.jar
```

Alternatively, you can use the provided shell script "compile.sh" by providing it the file name (without extension):

```bash
$ ./compile.sh file-name
```

This will compile and run the `file-name.kt` file.

## Topics Covered in this Repo

This repository currently covers the following topics:

1. [Output & Data Types](output_datatypes.kt)
2. [Input](taking_input.kt)
3. [Operators](operators.kt)
4. [Conditionals](conditionals.kt)
5. [Loops](loops.kt)
6. [Functions](functions.kt)
7. [Types of classes](classes.kt)
8. OOP Concepts
   * [Class : defination, constructors and access specifiers ](classDeepDive.kt)
   * [Inheritance ](inheritance.kt)
   * [polymorphism](polymorphism.kt)
   * [Encapsulation](encapsulation.kt)
   * [Abstraction](abstraction.kt)
   * [Interfaces](interface.kt)
---