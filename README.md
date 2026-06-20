# Java 21 Features

![Maven Build](https://github.com/ismaelcc83/java21/actions/workflows/maven.yml/badge.svg)

Practical exploration of some relevant features introduced in Java 21.

This repository contains small, focused and executable examples designed to understand modern Java 21 features such as virtual threads, sequenced collections, record patterns and pattern matching for switch.

## Author

Created by [Ismael Castro Capafons](https://github.com/ismaelcc83)

## Features included

- **JEP 431** - Sequenced Collections
- **JEP 440** - Record Patterns
- **JEP 441** - Pattern Matching for switch
- **JEP 444** - Virtual Threads

## Project structure

```text
java21/
├── .github/
│   └── workflows/
│       └── maven.yml
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
├── pom.xml
└── README.md
```

## Requirements

- JDK 21
- Maven 3.8 or higher

## How to compile

```bash
mvn clean compile
```

## How to run

Run the `App` class from your IDE.

The application shows a simple console menu where each option executes one Java 21 example.

## How to test

```bash
mvn clean test
```

## How to verify

Run the full Maven verification lifecycle:

```bash
mvn clean verify
```

This command compiles the project, runs the tests and executes the configured quality checks.

## How to format

If Spotless is configured in the `pom.xml`, format the code with:

```bash
mvn spotless:apply
```

To check formatting without modifying files:

```bash
mvn spotless:check
```

## Continuous Integration

This project includes a GitHub Actions workflow that runs the Maven build automatically on pushes and pull requests.

The workflow executes:

```bash
mvn clean verify
```

## Purpose

The goal of this project is to explore and understand Java 21 features through small, simple and executable code examples.

Java 21 is a long-term support version and introduces important improvements for modern backend development, especially virtual threads and richer pattern matching capabilities.

The examples are intentionally simple, but the project also includes unit tests and build automation to keep the repository clean, maintainable and closer to a professional Java project structure.

## Notes

The examples in this repository focus on:

- using sequenced collections to work with ordered collections in a clearer way;
- using record patterns to destructure record values;
- using pattern matching for switch to simplify type-based branching;
- using virtual threads to understand the new concurrency model introduced by Project Loom;
- keeping examples small, readable and easy to execute.
