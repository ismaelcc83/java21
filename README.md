# Java 21 Features

![Maven Build](https://github.com/ismaelcc83/java21/actions/workflows/maven.yml/badge.svg)

Practical exploration of some relevant features introduced in Java 21.

This repository contains small, focused and executable examples designed to understand modern Java features such as sequenced collections, record patterns, pattern matching for switch and virtual threads.

## Author

Created by [Ismael Castro Capafons](https://github.com/ismaelcc83)

## Features included

* **JEP 431** - Sequenced Collections
* **JEP 440** - Record Patterns
* **JEP 441** - Pattern Matching for switch
* **JEP 444** - Virtual Threads

## Project structure

```text
java21/
├── .github/
│   └── workflows/
│       └── maven.yml
├── .mvn/
│   └── wrapper/
│       └── maven-wrapper.properties
├── src/
│   ├── main/
│   │   └── java/
│   │       └── dev/
│   │           └── eltiempovuela/
│   │               └── java21/
│   │                   └── jeps/
│   │                       ├── App.java
│   │                       ├── Jep431.java
│   │                       ├── Jep440.java
│   │                       ├── Jep441.java
│   │                       └── Jep444.java
│   └── test/
│       └── java/
│           └── dev/
│               └── eltiempovuela/
│                   └── java21/
│                       └── jeps/
│                           ├── Jep431Test.java
│                           ├── Jep440Test.java
│                           ├── Jep441Test.java
│                           └── Jep444Test.java
├── .gitignore
├── LICENSE
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Requirements

* JDK 21
* Maven is not required locally because this project includes the Maven Wrapper.

## Maven Wrapper

This project includes the Maven Wrapper, so the build can be executed without installing Maven manually.

On Linux or macOS, use:

```bash
./mvnw
```

On Windows, use:

```bash
mvnw.cmd
```

## How to compile

On Linux or macOS:

```bash
./mvnw clean compile
```

On Windows:

```bash
mvnw.cmd clean compile
```

## How to run

Run the `App` class from your IDE.

The application shows a simple console menu where each option executes one Java 21 example.

## How to test

On Linux or macOS:

```bash
./mvnw clean test
```

On Windows:

```bash
mvnw.cmd clean test
```

## How to verify

Run the full Maven verification lifecycle.

On Linux or macOS:

```bash
./mvnw clean verify
```

On Windows:

```bash
mvnw.cmd clean verify
```

This command compiles the project, runs the tests and executes the configured quality checks, including Spotless.

## How to format

Format the code with Spotless.

On Linux or macOS:

```bash
./mvnw spotless:apply
```

On Windows:

```bash
mvnw.cmd spotless:apply
```

To check formatting without modifying files, run:

On Linux or macOS:

```bash
./mvnw spotless:check
```

On Windows:

```bash
mvnw.cmd spotless:check
```

## Continuous Integration

This project includes a GitHub Actions workflow that runs the Maven build automatically on pushes and pull requests.

The workflow executes the full Maven verification lifecycle:

```bash
mvn clean verify
```

If desired, the workflow can also be changed to use the Maven Wrapper:

```bash
./mvnw clean verify
```

## Purpose

The goal of this project is to explore and understand Java 21 features through small, simple and executable code examples.

Java 21 is a long-term support version and includes important improvements for modern Java development. The examples are intentionally simple, but the project also includes unit tests, code formatting and build automation to keep the repository clean, maintainable and closer to a professional Java project structure.

## Notes

The examples in this repository focus on:

* using sequenced collections to access first and last elements in a more consistent way;
* using record patterns to deconstruct record values clearly;
* using pattern matching for switch to write more expressive conditional logic;
* understanding virtual threads and their role in modern concurrent Java applications.
